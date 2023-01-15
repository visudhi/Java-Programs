//Write a program to print the circumference and area of a circle 
//of radius entered by user by defining your own method.

import java.util.Scanner;
public class pgm06
 {
    public static void main(String[] args)
    {
        Double radius;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the  radius");
        radius=sc.nextDouble();
        Calculate(radius);
        sc.close();
    }

    static void Calculate(double radius)
    {
        double circumference=(2*Math.PI*radius);
        double area=(Math.PI*radius*radius);
        System.out.println("The circumference is "+circumference);
        System.out.println("The area is "+area);
    }
}
