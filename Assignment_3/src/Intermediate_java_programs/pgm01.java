//Factorial Program 

package Intermediate_java_programs;
import java.util.Scanner;
public class pgm01 {
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+ " is "+ factorial(num));
        sc.close();
    }
    
}