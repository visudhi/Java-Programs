//pgm to find the power in java like square,cube or a number raised to any power

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm07 {
    public static void main(String[] args) {
        int base,power;
        Scanner sc= new Scanner(System.in);
        int result=1;
        System.out.println("enter the base value");
        base=sc.nextInt();
        System.out.println("enter the power to be raised");
        power=sc.nextInt();
        while(power!=0)
        {
            result=result*base;
            power--;
        }
        sc.close();
        System.out.println("result= " + result);
    
    }
}

//there are 6 ways to solve this problem:-
//while loop
//divide and conquer
//bit manipulation
//for loop
//math.pow
//recursion

