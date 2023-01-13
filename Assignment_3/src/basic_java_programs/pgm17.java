//pgm to find the Volume Of a Sphere

package basic_java_programs;
import java.util.Scanner;
public class pgm17 {
    public static void main(String[] args) {
        double v,r;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius r in meters");
        r=sc.nextDouble();
        v=(4*r*r*r)/(3);
        System.out.println("the volume of the sphere is "+v+ " metercubed");
        sc.close();

    }
}
