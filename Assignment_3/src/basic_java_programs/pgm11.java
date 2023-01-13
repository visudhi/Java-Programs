//pgm to find the Perimeter Of a Rectangle

package basic_java_programs;
import java.util.Scanner;


public class pgm11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double p,l,b;
        System.out.println("Enter the length in meters");
        l=sc.nextDouble();
        System.out.println("Enter the width  in meters");
        b=sc.nextDouble();
        p=2*(l+b);
        System.out.println("the perimeter is "+p+" meters");
        sc.close();
    }
}
