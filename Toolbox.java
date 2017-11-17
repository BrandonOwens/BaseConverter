import java.lang.Math;
import java.util.Scanner;  
public class Toolbox
{
   public static void main (String[]args)
    {
      System.out.print("This code is nothing more then basic utility for the other classes in base convert");
     }
    public double htod(String hex)
    {
         double a=0;
        double ex;
        for(int q=1;q<=hex.length();q++)
        {
            int o=q;

            if(hex.substring(q-1,q).equals("1"))
            {
                 ex=(hex.length()-o);
                a=a+Math.pow(16,ex);
            }
            if(hex.substring(q-1,q).equals("2"))
            {
                 ex=(hex.length()-o);
                a=a+(2*Math.pow(16,ex));
            }
            if(hex.substring(q-1,q).equals("3"))
            {
                 ex=(hex.length()-o);
               a=a+(3*Math.pow(16,ex));
            }
            if(hex.substring(q-1,q).equals("4"))
            {
                 ex=(hex.length()-o);
                a=a+(4*Math.pow(16,ex));
            }
             if(hex.substring(q-1,q).equals("5"))
            {
                 ex=(hex.length()-o);
                a=a+(5*Math.pow(16,ex));
            }
            if(hex.substring(q-1,q).equals("6"))
            {
                 ex=(hex.length()-o);
               a=a+(6*Math.pow(16,ex));
            }
            if(hex.substring(q-1,q).equals("7"))
            {
               ex=(hex.length()-o);
                a=a+(7*Math.pow(16,ex));
            }
            if(hex.substring(q-1,q).equals("8"))
            {
                  ex=(hex.length()-o);
                a=a+(8*Math.pow(16,ex));
            }
            if(hex.substring(q-1,q).equals("9"))
            {
                  ex=(hex.length()-o);
                 a=a+(9*Math.pow(16,ex));
            }
            if(hex.substring(q-1,q).equals("A")||(hex.substring(q-1,q).equals("a")))//has an or statement in case the number is entered in lower case
            {
                  ex=(hex.length()-o);
                a=a+(10*Math.pow(16,ex));
            }
              if(hex.substring(q-1,q).equals("B")||(hex.substring(q-1,q).equals("b")))
            {
                 ex=(hex.length()-o);
                a=a+(11*Math.pow(16,ex));
            }
            if(hex.substring(q-1,q).equals("C")||(hex.substring(q-1,q).equals("c")))
            {
                  ex=(hex.length()-o);
                a=a+(12*Math.pow(16,ex));
            }
              if(hex.substring(q-1,q).equals("D")||(hex.substring(q-1,q).equals("d")))
            {
                  ex=(hex.length()-o);
               a=a+(13*Math.pow(16,ex));
            }
             if(hex.substring(q-1,q).equals("E")||(hex.substring(q-1,q).equals("e")))
             {
                ex=(hex.length()-o);
              a=a+(14*Math.pow(16,ex));      
            }
              if(hex.substring(q-1,q).equals("F")||(hex.substring(q-1,q).equals("f")))
            {
                 ex=(hex.length()-o);
                a=a+(15*Math.pow(16,ex));
            }
        }
        return a;
    }
     public String dtob(long decimal)
    {
        long binary=0;
        String b="0000000000000000000000000";
        int place = 0;
       while(decimal>0){
        binary= decimal%2;
        b=binary+b.substring(b.length()-place);
        decimal = decimal/2;
        place++;
      }
     return b;
   }
}