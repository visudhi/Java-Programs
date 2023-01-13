//Area Of Circle Java Program

package basic_java_programs;
import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        double r,Area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a radius in meters");
        r=sc.nextDouble();
        Area=(3.14*r*r);
        System.out.println("The area of the circle is "+Area+ " Square Meters");
        sc.close();
    }
}
