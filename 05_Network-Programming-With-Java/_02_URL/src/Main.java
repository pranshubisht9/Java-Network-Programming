import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.pranshusinghbisht.online");

        getURL(url);

    }

    static void getURL(URL url){
        System.out.println("HOST : "+ url.getHost());
        System.out.println("PATH : "+url.getPath());
        System.out.println("REF : "+url.getRef());
    }
}

/*
URN, URI, and URL are all related terms used in web development and internet architecture, but they have slightly different meanings.

URN (Uniform Resource Name) is a type of URI that is used to identify a resource by its name, independent of its location. It provides a persistent identifier for a resource that is not tied to any particular network protocol or location. For example, an ISBN (International Standard Book Number) can be used as a URN to identify a book, regardless of where it is located.

URI (Uniform Resource Identifier) is a string of characters that identifies a resource on the Internet. It can be used to identify any type of resource, including web pages, images, videos, and documents. A URI can be either a URL or a URN.

URL (Uniform Resource Locator) is a type of URI that specifies the location of a resource on the Internet. It consists of the protocol (such as HTTP or FTP), the domain name, and the path to the resource. For example, http://www.example.com/index.html is a URL that identifies the web page index.html on the domain www.example.com using the HTTP protocol.

In summary, URN is a type of URI that identifies a resource by name, while URL is a type of URI that identifies a resource by its location. All URLs are URIs, but not all URIs are URLs.
 */