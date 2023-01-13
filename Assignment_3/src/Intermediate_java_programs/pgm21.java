//pgm to reverse a string using stringbuilder

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String x=sc.next();
        StringBuilder x1= new StringBuilder();
        x1.append(x);
        x1.reverse();
        System.out.println(x1);
        sc.close();
    }
}
