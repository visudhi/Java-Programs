//pgm to find the Volume Of a Pyramid

package basic_java_programs;
import java.util.Scanner;


public class pgm18 {
    public static void main(String[] args) {
        double v,l,b,h;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter l in meters");
        l=sc.nextDouble();
        System.out.println("enter b in meters");
        b=sc.nextDouble();
        System.out.println("enter h in meters");
        h=sc.nextDouble();

        v=(l*b*h)/(3);
        System.out.println("volume of the pyramid is "+v+" metercubed");
        sc.close();
    }
}
