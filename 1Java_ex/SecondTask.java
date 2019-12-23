import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondTask {

        public static void main(String [] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            char ch = (char)reader.read();
          int ascii = ch;
          System.out.println("The ASCII value of "+ch+ " is: "+ascii);

        }


}
