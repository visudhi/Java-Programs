//pgm to find the Perimeter Of a Square

package basic_java_programs;
import java.util.Scanner;

public class pgm12 {
    public static void main(String[] args) {
        double p,s;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the side s in meters");
        s=sc.nextDouble();
        p=4*s;
        System.out.println("the perimeter of the square is "+p+" meters");
        sc.close();
    }
}
