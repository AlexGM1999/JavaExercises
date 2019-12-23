package Polindrom;

public class packagePolindrom {
    public static boolean isPolindrom(String s){
        return  s.equals(new StringBuilder(s).reverse().toString());
    }

}
