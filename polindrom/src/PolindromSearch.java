import java.util.Scanner;
import Polindrom.*;
public class PolindromSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        packagePolindrom p = new packagePolindrom();
        if(p.isPolindrom(word))
            System.out.println("Думата е полиднром");
        else
            System.out.println("думата не е полиндром");
    }
}
