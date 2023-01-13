//pgm to find the Perimeter Of a Circle

package basic_java_programs;
import java.util.Scanner;

public class pgm8 {
    public static void main(String[] args) {
        double r,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius in meters");
        r= sc.nextDouble();
        c=(2*3.14*r);
        System.out.println("The circumference of the circle is "+c+ " meters");
        sc.close();
    }
}
