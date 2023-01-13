//pgm to find area of an Area Of Isosceles Triangle

package basic_java_programs;
import java.util.Scanner;

public class pgm4 {
    public static void main(String[] args) {
        double b,h;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of b in meters");
        b=sc.nextDouble();
        System.out.println("Enter the value of h in meters");
        h=sc.nextDouble();
        double area=(b*h)/(2);
        System.out.println("Area of the isoscles triangle is "+ area+ " square meters");
        sc.close();
    }
}
