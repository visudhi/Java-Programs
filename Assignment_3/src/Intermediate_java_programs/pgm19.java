//pgm to reverse a string
//input="abcde"
//output="edcba"

package Intermediate_java_programs;
import java.util.Scanner;

class pgm19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String x2=sc.next();
        String x3="";
        
        for(int i=0;i<x2.length();i++)
        {
            char ch=x2.charAt(i);
            x3=ch+x3;
            
        }
        System.out.println(x3);

        
        sc.close();
         
    }
}