//pgm to reverse a string using recursion

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm26
{
    void reverse(String str)
    {
        if((str==null)||(str.length()<=1))
            System.out.println(str);
        else
        {
            System.out.println(str.charAt(str.length()-1));
            reverse(str.substring(0, str.length()-1));
        }
    }

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String x= sc.next();
        sc.close();
        pgm26 y= new pgm26();
        y.reverse(x);
        
    }
}