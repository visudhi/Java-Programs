//pgm to find the Perimeter Of a Parallelogram

package basic_java_programs;
import java.util.Scanner;

public class pgm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,l,b;
        System.out.println("Enter the length l of the parallelogram in meters ");
        l=sc.nextDouble();
        System.out.println("Enter the breadth b of the parallelogram in meters");
        b=sc.nextDouble();
        p=2*(l+b);
        System.out.println("Permeter of the parallelogram is "+p+" meters");
        sc.close();
    }
}
