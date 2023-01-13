//pgm to find the Area Of a Parallelogram

package basic_java_programs;
import java.util.Scanner;


public class pgm5 {
    public static void main(String[] args) {
        double b,h;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the base b in meters");
        b=sc.nextDouble();
        System.out.println("Enter the height h in meters");
        h=sc.nextDouble();
        double area=b*h;
        System.out.println("Area of the parallelogram is "+ area +" meter square");
        sc.close();
    }
}
