import java.lang.Math;
import java.util.Scanner;  
public class Binary
{
    public static void main(String[]args)
    {
        System.out.print("This file converts binary to other bases"+"\n"+"Here are some examples ");
        String test1, test2, test3;
        Binary a= new Binary();
        test1 = "1111";
        test2 = "1110";
        test3 = "1010";
        System.out.print("The three test numbers are as follows:"+"\n"+test1+"\n"+test2+"\n"+test3+"\n");
        System.out.print("Test 1 becomes: "+a.btod(test1)+"\n");
        System.out.print("Test 2 becomes: "+a.btod(test2)+"\n");
        System.out.print("Test 3 becomes: "+a.btod(test3)+"\n");
        System.out.print("Test 1 becomes: "+a.btoh(test1)+"\n");
        System.out.print("Test 2 becomes: "+a.btoh(test2)+"\n");
        System.out.print("Test 3 becomes: "+a.btoh(test3)+"\n");
    }
    public long btod(String binary)
    {
        double a=0.0;
        double ex;
        for(int q=1;q<=binary.length();q++)
        {
            if(binary.substring(q-1,q).equals("1"))
            {
                 ex=(binary.length()-q);
                 a=a+Math.pow(2,ex);
            }
        }
        long change =(long) a;
        return change;
    }
    public String btoh(String binary)
    {
        int a=00;
        int ex;
        int place=0;
        int p2=1;
        char dec;
        String hd="0";
        for(int q=1;q<=binary.length();q++)//converts binary to base 10
        {
            if(binary.substring(q-1,q).equals("1"))
            {
                 ex=(binary.length()-q);
                 int result = (int)Math.pow(2, ex);
                  a=a+result;
            }
        } 
        while(a>0){//converts base 10 to hexadecimal
         int hex= a%16;
         if(hex >9)
         {
             dec=above9(hex);
            hd=dec+hd.substring(hd.length()-place);
         }
         if(hex<=9)
         {
                hd=hex+hd.substring(hd.length()-place);//+hd.substring(place+2);
         }
         a = a/16;
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