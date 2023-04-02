import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSide {
    private static final int PORT = 1234;

    private static InetAddress host;


    public static void main(String[] args) {
        try{
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("Error Caused : "+e.getMessage());
            System.exit(1);
            throw new RuntimeException(e);
        }
        accessServer();
    }

    private static void accessServer() {
//        Socket link = null;  // STEP 1         ------instead of null here we have to make new socket

            Socket link = new Socket() ;

        try {
            link = new Socket(host, PORT);

            Scanner input = new Scanner(link.getInputStream()); //STEP 2
            PrintWriter output = new PrintWriter(link.getOutputStream(), true);
            Scanner userEntry = new Scanner(System.in);
            String message, response;
            do {
                System.out.println("ENTER MESSAGE : ");
                message = userEntry.nextLine();
                output.println(message); // STEP 3
                response = input.nextLine(); //STEP 3
                System.out.println("\nSERVER > "+response);

            }while (!message.equals("***CLOSE***"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {

            try {
                System.out.println("\n* CLOSING CONNECTION...*");
                link.close(); //STEP 4
            } catch (IOException e) {
                System.out.println("Unable to Disconnect ERROR : "+ e.getMessage());
//                throw new RuntimeException(e);
                System.exit(1);
            }
        }
    }

}
