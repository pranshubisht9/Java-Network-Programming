import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSide {

    private static ServerSocket serverSocket;

    private static final int PORT = 1234;



    public static void main(String[] args) {

        System.out.println("OPENING PORT : "+ PORT + "\n" );

        try {
            serverSocket = new ServerSocket(PORT); // STEP 1
        } catch (IOException e) {
            System.out.println("ENABLE TO ATTACH TO PORT ! EXCEPTION : "+ e.getMessage());
            throw new RuntimeException(e);
        }

        do {
            handleClient();
        }while (true);
    }

    private static void handleClient() {
        Socket link = null; // STEP 2

        try {
            link = serverSocket.accept();
            Scanner input = new Scanner(link.getInputStream()); //STEP 3
            PrintWriter output = new PrintWriter(link.getOutputStream(), true); // STEP 3

            int numMessage = 0;
            String message = input.nextLine(); //STEP 4

            while (!message.equals("***CLOSES***")){
                System.out.println("MESSAGE RECEIVED");
                numMessage++;
                message = input.nextLine();
            }
            output.println(numMessage + "messages received"); //STEP 4

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }finally {
            System.out.println("\n * CLOSING CONNECTION... *");
            try {
                link.close();
            } catch (IOException e) {
                System.out.println("*UNABLE TO DISCONNECT ! : "+ e.getMessage());
                throw new RuntimeException(e);
            }
        }

    }


}