import java.lang.Math;
import java.util.Scanner;  
public class Decimal
{
   public static void main(String[]args)
   {
       System.out.print("This file converts decimal to other bases"+"\n"+"Here are some examples ");
        long test1, test2, test3;
        Decimal a= new Decimal();
        test1 = 1232;
        test2 = 100;
        test3 = 9999;
        System.out.print("The three test numbers are as follows:"+"\n"+test1+"\n"+test2+"\n"+test3+"\n");
        System.out.print("Test 1 becomes: "+a.dtob(test1)+"\n");
        System.out.print("Test 2 becomes: "+a.dtob(test2)+"\n");
        System.out.print("Test 3 becomes: "+a.dtob(test3)+"\n");
        System.out.print("Test 1 becomes: "+a.dtoh(test1)+"\n");
        System.out.print("Test 2 becomes: "+a.dtoh(test2)+"\n");
        System.out.print("Test 3 becomes: "+a.dtoh(test3)+"\n");
    }
    public String dtob(long decimal)
    {
        Toolbox b= new Toolbox();
        
     return b.dtob(decimal);
   }
   public String dtoh(long decimal)
   {
        int ex;
        int place=0;
        int p2=1;
        char dec;
        String hd="00000000000000";
        while(decimal>0){//converts base 10 to hexadecimal
         long hex= decimal%16;
         if(hex >9)
         {
             dec=above9(hex);
            hd=dec+hd.substring(hd.length()-place);
         }
         if(hex<=9)
         {
                hd=hex+hd.substring(hd.length()-place);//+hd.substring(place+2);
         }
         decimal = decimal/16;
         place++;
         p2++;
       } 
       return hd;
       }
    public char above9 (double hex)
   {
        char c='a';
        if(hex==10)
         c='A';
        if(hex==11)
         c='B';
        if(hex==12)
         c='C';
        if(hex==13)
         c='D';
        if(hex==14)
         c='E';
        if(hex==15)
         c='F';          
        return c;
     }
}