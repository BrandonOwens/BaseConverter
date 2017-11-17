/**
* This program has minor limitations
* This program can support a decimal number up to 32 digits 
* This program does not work with negative numbers
*
*/
import java.lang.Math;
import java.util.Scanner;  
public class BaseConvert
{  
    public static void main (String[]args)
    {
        test1();
        test2();
        test3();
        test4();
    }
    public static void test1 () {
        System.out.print("This program will test the class used for base conversion."+"\n");
         System.out.print("This main method will run 9 tests and then a user influenced round test."+"\n");
        System.out.print("This is a binary test"+"\n");
        String test1 = "1011";
        String test2 = "1111";
        String test3 = "111";
        System.out.print("The test numbers are "+"\n"+test1+"\n"+test2+"\n"+test3+"\n");
        Binary a= new Binary();
        System.out.print("Changed to Decimal:"+"\n");
        System.out.print(   a.btod(test1)+"\n");
        System.out.print(   a.btod(test2)+"\n");
        System.out.print(   a.btod(test3)+"\n");
        System.out.print("Changed to Hexadecimal:"+"\n");
        System.out.print(   a.btoh(test1)+"\n");
        System.out.print(   a.btoh(test2)+"\n");
        System.out.print(   a.btoh(test3)+"\n");
    }
    public static void test2 () {
        System.out.print("This is a decimal test"+"\n");
        long test4=100;
        long test5=190;
        long test6=9670;
        System.out.print("The test numbers are "+"\n"+test4+"\n"+test5+"\n"+test6+"\n");
        Decimal b = new Decimal();
        System.out.print("Changed to Binary:"+"\n");
        System.out.print(   b.dtob(test4)+"\n");
        System.out.print(   b.dtob(test5)+"\n");
        System.out.print(   b.dtob(test6)+"\n");
        System.out.print("Changed to Hexadecimal:"+"\n");
        System.out.print(   b.dtoh(test4)+"\n");
        System.out.print(   b.dtoh(test5)+"\n");
        System.out.print(   b.dtoh(test6)+"\n");
    }
     public static void test3 () {
        System.out.print("This is a hexadecimal test"+"\n");
        String test7="FF";
        String test8="ABC";
        String test9="9670";
        System.out.print("The test numbers are "+"\n"+test7+"\n"+test8+"\n"+test9+"\n");
        Hexadecimal c = new Hexadecimal();
        System.out.print("Changed to Decimal:"+"\n");
        System.out.print(   c.htod(test7)+"\n");
        System.out.print(   c.htod(test8)+"\n");
        System.out.print(   c.htod(test9)+"\n");
        System.out.print("Changed to Binary:"+"\n");
        System.out.print(   c.htob(test7)+"\n");
        System.out.print(   c.htob(test8)+"\n");
        System.out.print(   c.htob(test9)+"\n");
    }
    public static void test4 () {
        System.out.print("This is a round test"+"\n");
         System.out.print("Enter a binary number"+"\n");
         Scanner rt = new Scanner(System.in);
         String t1 = rt.next();
         Binary a= new Binary();
         Decimal b = new Decimal();
         System.out.print("Binary to Decimal"+"\n");
         System.out.print(   a.btod(t1)+"\n");
         System.out.print("Decimal to Hexadecimal"+"\n");
         System.out.print(   b.dtoh(a.btod(t1))+"\n");
         System.out.print("Decimal to Binary"+"\n");
         System.out.print(  b.dtob( a.btod(t1))+"\n");
        }
 }