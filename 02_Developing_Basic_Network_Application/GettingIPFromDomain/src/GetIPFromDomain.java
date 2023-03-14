import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPFromDomain {
    public static void main(String[] args) throws IOException {

//        InetAddress googleWebsite = InetAddress.getByName("www.google.com");
//        System.out.println(googleWebsite);

        InetAddress myWebsite = InetAddress.getByName("www.masaischool.com");
        System.out.println("HOST ADDRESS : "+ myWebsite.getHostAddress());
        System.out.println("CANONCAL HOST NAME : "+ myWebsite.getCanonicalHostName());
        System.out.println("HOST NAME : "+myWebsite.getHostName());
        myWebsite.isReachable(10000);
    }
}

/*
In Java, InetAddress is a class that represents an IP address. It provides methods for working with IP addresses and performing DNS lookups to get the IP address of a hostname or the hostname of an IP address.

Here are some of the key methods of the InetAddress class:

getByName(String host) - returns an InetAddress object representing the IP address of the specified hostname.
getHostAddress() - returns the IP address string in textual presentation.
getHostName() - returns the hostname for this IP address.
isReachable(int timeout) - tests whether the address is reachable within the specified timeout.
getLocalHost() - returns the InetAddress object representing the local host.
Here is an example of how to use InetAddress to get the IP address of a hostname:
 */