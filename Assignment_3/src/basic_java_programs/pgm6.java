//pgm to find the Area Of a Rhombus

package basic_java_programs;
import java.util.Scanner;


public class pgm6 {
    public static void main(String[] args) {
        double d1,d2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the first diagonal d1 in meters");
        d1=sc.nextDouble();
        System.out.println("Enter the length of the first diagonal d2 in meters");
        d2=sc.nextDouble();
        double area=(d1*d2)/(2);
        System.out.println("Thea area of the rhombus is "+area+" square meters");
        sc.close();
    }
}
