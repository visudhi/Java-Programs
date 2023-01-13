//pgm to find the Volume Of a Cone 

package basic_java_programs;
import java.util.Scanner;

public class pgm14 {
    public static void main(String[] args) {
        double r,h,v;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius r in meters");
        r=sc.nextDouble();
        System.out.println("enter the height h in meters");
        h=sc.nextDouble();
        v=(3.14*r*r*h)/(3);
        System.out.println("the volume of the cone is "+v+" metercubed");
        sc.close();

    }
}
