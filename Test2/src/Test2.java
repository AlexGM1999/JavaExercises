import java.io.*;
import java.net.*;

public class Test2 {
    public static void main(String args[]) {
        int abyte;

        try {
            URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/d/d6/Bee_balm_seedhead_%2870424%29.jpg");
            InputStream inputStream = url.openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("picture.jpg");
            System.out.println("starting ...");

            while((abyte = inputStream.read()) != -1) {
                fileOutputStream.write(abyte);
            }

            inputStream.close();
            fileOutputStream.close();
            System.out.println("created");
        }
        catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me.getMessage());
        }
        catch (IOException ioe) {
            System.out.println("IOException: " + ioe.getMessage());
        }
    }
}