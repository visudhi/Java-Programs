//pgm to find the Area Of an Equilateral Triangle

package basic_java_programs;
import java.util.Scanner;


public class pgm7 {
    public static void main(String[] args) {
        double area,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the side s in meters");
        s=sc.nextDouble();
        area=((Math.sqrt(3)*s*s)/4);
        System.out.println("The area of the equilateral triangle is "+area+" square meters");
        sc.close();
        
    }
}
