// pgm to reverse a string using  getbytes method

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm20
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a new string");
        String x3=sc.next();
        byte[] x4=x3.getBytes();
        byte[] result= new byte[x4.length];
        for(int i=0;i<x4.length;i++)
        {
            result[i]=x4[x4.length-i-1];
        }
        System.out.println(new String(result));
        sc.close();
    }   
}
