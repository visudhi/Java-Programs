//Area Of Rectangle Program

package basic_java_programs;
import java.util.Scanner;

public class pgm3 
{
        public static void main(String[] args) {
        double l,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the rectangle  in meters");
        l=sc.nextDouble();
        System.out.println("enter the breadth of the rectangle in meters");
        b=sc.nextDouble();
        double Area=l*b;
        System.out.println("The area of the rectangle is "+Area+ " square meters");
        sc.close();
    }
}
