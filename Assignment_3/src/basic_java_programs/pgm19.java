//pgm to find the Curved Surface Area Of a Cylinder

package basic_java_programs;
import java.util.Scanner;



public class pgm19 {
    public static void main(String[] args) {
        double r,h,csa;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of radius r in meters");
        r=sc.nextDouble();
        System.out.println("enter the value of h in meters");
        h=sc.nextDouble();
        csa=2*(Math.PI)*(r*h);
        System.out.println("the csa of the cylinder is "+csa+" metersquared");
        sc.close();

    }
}
