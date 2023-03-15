import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress names[] = InetAddress.getAllByName("google.com");

        for(InetAddress name : names){
            System.out.println(name);
        }

    }
}
/*

In Java, InetAddress is a class that represents an Internet Protocol (IP) address. I
t provides methods for working with IP addresses, including getting the host name
from an IP address, getting the IP address from a host name, and checking if an IP
address is reachable.

To obtain an InetAddress instance, you can use one of the following methods:

getByName(String host): Returns an InetAddress object that represents the specified host name.

getByAddress(byte[] addr): Returns an InetAddress object that represents the specified
raw IP address.

Once you have an InetAddress instance, you can use its methods to get information about the
IP address or host name. Some of the commonly used methods of InetAddress are:

getHostAddress(): Returns the IP address string in textual presentation.

getHostName(): Returns the host name corresponding to the IP address.

isReachable(int timeout): Tests whether that address is reachable.

Here is an example code snippet that demonstrates how to use InetAddress in Java:

java
Copy code
import java.net.InetAddress;

public class InetAddressExample {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.google.com");
        System.out.println("Host name: " + address.getHostName());
        System.out.println("IP address: " + address.getHostAddress());
        System.out.println("Is reachable: " + address.isReachable(5000));
    }
}
In this example, we create an InetAddress instance for the host name www.google.com
and use its methods to print the host name, IP address, and whether it is reachable or not.
*/