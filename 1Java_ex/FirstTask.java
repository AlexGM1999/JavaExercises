import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String usd = reader.readLine();
        double price = Double.parseDouble(usd);
        Val obj = new Val(price);

        System.out.println(price + " converted into GBP is " + obj.gbp);
        System.out.println(price + " converted into CAD is " + obj.cad);
        System.out.println(price + " converted into EUR is " + obj.eur);
        System.out.println(price + " converted into AUD is " + obj.aud);
        System.out.println(price + " converted into Indian Rupees is " + obj.rup);
}
    public static class Val{
        double gbp;
        double cad;
        double eur;
        double aud;
        double rup;

        public Val(double value){

            gbp = value*0.80;
            cad = value*1.32;
            eur = value*0.90;
            aud = value*1.47;
            rup = value*0.01;
        }
    }
}