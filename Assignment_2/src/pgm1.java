//Write a program to print whether a number is even or odd, 
//also take input from the user.
import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter any number");
        int number1= number.nextInt();
        if(number1%2==0)
        System.out.println(number1+" is an even number");
        else
        System.out.println(number1+" is an odd number");
    }
}
