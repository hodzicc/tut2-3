package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.math.*;
import static java.util.Collections.max;
import static java.util.Collections.min;


public class App
{
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
    public static void main( String[] args )
    {
        System.out.println( "Unos" );
        Scanner ulaz =new Scanner(System.in);
        String n;
        List<Double> l = new ArrayList<Double>();
        while(true){
            n=ulaz.nextLine();
            if(n.equals("stop"))
                break;

            if(isNumeric(n))
            l.add(Double.parseDouble(n));
    }
       double suma=0;
        int i=0;
        for(double d:l){
            suma+=d;
            i++;
        }
        double mean=suma/i, standev=0.0;
        for(double d: l){
            standev += Math.pow(d - mean, 2);
        }
        System.out.println("Minimum je: "+min(l));
        System.out.println("Maximum je: "+max(l));
        System.out.println("Srednja vrijednost je: "+mean);
        System.out.println("Standardna devijacija je: "+Math.sqrt(standev/i));




    }
}
