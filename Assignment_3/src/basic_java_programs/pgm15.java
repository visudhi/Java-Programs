//pgm to find the Volume Of a Prism

package basic_java_programs;
import java.util.Scanner;

public class pgm15 {
    public static void main(String[] args) {
        double v,b,h;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of base in meters");
        b=sc.nextDouble();
        System.out.println("enter the height h in meters");
        h=sc.nextDouble();
        v=b*h;
        System.out.println("volume of the prism is "+v+" meters");
        sc.close();
    }
}
