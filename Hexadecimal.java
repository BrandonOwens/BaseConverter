import java.lang.Math;
import java.util.Scanner;  
public class Hexadecimal
{
    public static void main(String[]args)
    {
         System.out.print("This file converts hexadecimal to other bases"+"\n"+"Here are some examples ");
        String test1, test2, test3;
        Hexadecimal a= new Hexadecimal();
        test1 = "1232";
        test2 = "100";
        test3 = "9999";
        System.out.print("The three test numbers are as follows:"+"\n"+test1+"\n"+test2+"\n"+test3+"\n");
        System.out.print("Test 1 becomes: "+a.htob(test1)+"\n");
        System.out.print("Test 2 becomes: "+a.htob(test2)+"\n");
        System.out.print("Test 3 becomes: "+a.htob(test3)+"\n");
        System.out.print("Test 1 becomes: "+a.htod(test1)+"\n");
        System.out.print("Test 2 becomes: "+a.htod(test2)+"\n");
        System.out.print("Test 3 becomes: "+a.htod(test3)+"\n");
    }
    public double htod(String hex)
    {
        Toolbox a = new Toolbox();
        return a.htod(hex);
    }
    public String htob(String hex)
    {
          Toolbox a = new Toolbox();
          Toolbox b = new Toolbox();
          long x = (long) a.htod(hex);
          return b.dtob(x);
    }
    }