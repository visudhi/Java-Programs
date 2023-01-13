//pgm to find the Perimeter Of a nRhombus

package basic_java_programs;
import java.util.Scanner;

public class pgm13 {
    public static void main(String[] args) {
        double p,s;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the side s of rhombus in meters");
        s=sc.nextDouble();
        p=4*s;
        System.out.println("the perimeter of the rhombus is "+p+" meters");
        sc.close();
    }
    
}
