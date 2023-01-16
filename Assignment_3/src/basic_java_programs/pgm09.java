//pgm to find the Perimeter Of an Equilateral Triangle

package basic_java_programs;
import java.util.Scanner;


public class pgm09 {
    public static void main(String[] args) {
        double p,s;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of the side s in meters");
        s=sc.nextDouble();
        p=3*s;
        System.out.println("The perimeter of the equilateral triangle is "+p+" meters");
        sc.close();
    }
}
