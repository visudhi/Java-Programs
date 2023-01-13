//pgm to reverse a string using swapping

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm23
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String x4="";
        System.out.println("enter a string");
        String x=sc.next();
        sc.close();
        char[] x1=x.toCharArray();
        int li=0;
        int ri=x1.length-1;
        for(li=0;li<ri;li++,ri--)
        {
            char temp= x1[li];
            x1[li]=x1[ri];
            x1[ri]=temp;
        }

        for(char c:x1)
        {
            x4=x4+c;
            
        }
        System.out.println(x4);
    
    }
}
