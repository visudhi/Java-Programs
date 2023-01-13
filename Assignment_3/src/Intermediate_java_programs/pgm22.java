// pgm to reverse characters of a string using to_char array

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm22
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        String x3="";
        System.out.println("Enter a string");
        String x= sc.next();
        char[] x2=x.toCharArray();
        for(int i=x2.length-1;i>=0;i--)
        {
            x3=x3+x2[i];
        
        }
        System.out.println(x3);
        sc.close();
    }
}
