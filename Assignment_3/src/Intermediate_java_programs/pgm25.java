//pgm to reverse a string using stringbuffer

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String x=sc.next();
        sc.close();
        StringBuffer x1= new StringBuffer(x);
        x1.reverse();
        System.out.println(x1);
    }
}