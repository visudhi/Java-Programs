//Area Of Triangle

package basic_java_programs;
import java.util.Scanner;

public class pgm02 { 
    public static void main(String args[]) {
        double b,h,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of base b in meters");
        b=sc.nextDouble();
        System.out.println("Enter the value of height h in meters");
        h=sc.nextDouble();
        area=(b*h)/(2);//(1/2)*(b*h) dosent work ,(0.5*b*h works)
        System.out.println("The area of the triangle is "+area+" square meters");
        sc.close();
    }
}
