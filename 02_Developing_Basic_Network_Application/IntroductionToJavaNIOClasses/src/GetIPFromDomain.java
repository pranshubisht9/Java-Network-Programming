import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPFromDomain {
    public static void main(String[] args) throws IOException {

//        InetAddress googleWebsite = InetAddress.getByName("www.google.com");
//        System.out.println(googleWebsite);

        InetAddress myWebsite = InetAddress.getByName("www.pranshusinghbisht.online");
        System.out.println("HOST ADDRESS : "+ myWebsite.getHostAddress());
        System.out.println("CANONCAL HOST NAME : "+ myWebsite.getCanonicalHostName());
        System.out.println("HOST NAME : "+myWebsite.getHostName());
        myWebsite.isReachable(10000);

    }
}

/*

 */