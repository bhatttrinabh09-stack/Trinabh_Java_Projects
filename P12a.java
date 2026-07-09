import java.io.*;
import java.util.*;
public class P12a{
    public static void main(String[] args) {
        //ClassNotFoundException
        try {
            Class.forName("abc.Test");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught");
            System.out.println(e);
        }
        //IOException
        try {
            FileReader fr = new FileReader("sample.txt");
            fr.read();
            fr.close();
        }
        catch (IOException e) {
            System.out.println("IOException caught");
            System.out.println(e);
        }
        //NumberFormatException
        try {
            String s = "Trinabh";
            int num = Integer.parseInt(s);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
            System.out.println(e);
        }
        //ArithmeticException
        try {
            int a = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
            System.out.println(e);
        }
        //ArrayIndexOutOfBoundsException
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
            System.out.println(e);
        }
        //NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
            System.out.println(e);
        }
    }
}