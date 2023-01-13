//pgm to find the Total Surface Area Of a Cube

package basic_java_programs;
import java.util.Scanner;


public class pgm20 {
    public static void main(String[] args) {
        double tsa,s;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of s in meters");
        s=sc.nextDouble();
        tsa=6*Math.pow(s, 2);
        System.out.println("The value of the tsa of the cube is "+tsa+" meter squared");
        sc.close();
    }
}
