import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class GetIPFromDomain {
    public static void main(String[] args) throws IOException {

//        InetAddress googleWebsite = InetAddress.getByName("www.google.com");
//        System.out.println(googleWebsite);

        InetAddress myWebsite = InetAddress.getByName("www.pranshusinghbisht.online");

       /* FileChannel;
        DatagramChannel; //udp
        SocketChannel; //tcp
        ServerSocketChannel; //tcp*/

    }
}

/*

basic aspects of the basic aspectts of java that..
there are three key concepts used in java neo package here.

1> channel: This channel represents a stream of data between applications and the second we have buffer.

2> buffer: The buffer works with a channel to process data

3> selector is the technology that allows a single thread to handle multiple channels.

Data may be transferred from a channel to a buffer or buffer to a channel
The Buffer, as its name implies, is temporary  repository for information .
The Selector is useful in supporting the application scalability.


 */