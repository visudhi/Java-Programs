//pgm to find the Volume Of a Cylinder

package basic_java_programs;
import java.util.Scanner;


public class pgm16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r,h,v;
        System.out.println("enter the value of radius r in meters");
        r=sc.nextDouble();
        System.out.println("enter the value of height h in meters");
        h=sc.nextDouble();
        v=(Math.PI)*(r*r)*(h);
        System.out.println("volume of the cylinder is "+v+" meter cubed");
        sc.close();
    }
}
