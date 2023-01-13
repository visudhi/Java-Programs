//Write a program to input principal, time, and rate (P, T, R) 
//from the user and find Simple Interest.
import java.util.Scanner;

public class pgm3 {
    public static void main(String[] args) {
        double p,t,r,si;
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter principle ");
            p=sc.nextDouble();
            System.out.println("enter the time");
            t=sc.nextDouble();
            System.out.println("enter the rate");
            r=sc.nextDouble();
        
        si=((p*t*r)/100);
        System.out.println("The simple interest "+si);
    }
    
}
