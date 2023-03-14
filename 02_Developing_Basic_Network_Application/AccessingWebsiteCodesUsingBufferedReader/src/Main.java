import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {


        try{
            URL url = new URL("https://pranshusinghbisht.online");
            URLConnection myURLConnection = url.openConnection();

            BufferedReader br = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));

            String myLine;
            while ((myLine = br.readLine()) != null){
                System.out.println(myLine);
            }

            br.close();


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}

//#Neural Connection Class
/*
Connection class is a simple way to accessing a server.
This class represent a connection between an appliacation and URL instance.


A URL instance represent a resource on the internet.

* */