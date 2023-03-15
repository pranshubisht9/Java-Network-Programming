import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {

        /*NetworkInterface.getNetworkInterfaces();
        NetworkInterface.getByName();
        NetworkInterface.getByInetAddress()*/

        try {
            Enumeration<NetworkInterface> nie = NetworkInterface.getNetworkInterfaces();
            System.out.printf("Network Display : \n");
            for(NetworkInterface ele : Collections.list(nie)){
                System.out.printf("%-8s %-32s \n", ele.getName(), ele.getDisplayName());
            }
        }catch (SocketException e){
            e.printStackTrace();
        }




    }
}

//NetworkInterface Class
/*

Network interface class in java provides a means of accessing the device that acts as a not on a network.

In Java, the network interface class is represented by the java.net.NetworkInterface class, which provides methods for querying and manipulating network interface information.

Some of the methods available in the NetworkInterface class include:

getByName(String name): Returns the network interface with the specified name.
getByIndex(int index): Returns the network interface with the specified index.
getInetAddresses(): Returns an Enumeration of all the IP addresses bound to this network interface.
getHardwareAddress(): Returns the hardware address of the network interface.
Here is an example of using the NetworkInterface class to get information about the network interfaces on a system:

import java.net.*;
import java.util.*;

public class NetworkInterfaceExample {

    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            System.out.println("Name: " + ni.getName());
            System.out.println("Display Name: " + ni.getDisplayName());
            System.out.println("Is up? " + ni.isUp());
            System.out.println("Supports multicast? " + ni.supportsMulticast());
            System.out.println("Hardware address: " + Arrays.toString(ni.getHardwareAddress()));
            System.out.println();
        }
    }

}

This code gets all the network interfaces on the system and prints out their names, display names, whether they are up, whether they support multicast, and their hardware addresses.

*/
