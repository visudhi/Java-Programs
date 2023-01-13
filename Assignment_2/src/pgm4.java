//Take in two numbers and an operator (+, -, *, /) 
//and calculate the value. (Use if conditions)
import java.util.Scanner;

public class pgm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double n1= sc.nextDouble();
        System.out.println("enter second number");
        double n2=sc.nextDouble();
        if(n1>0 && n2>0){
        System.out.println(n1*n2);
    }
    else if (n1==0 && n2==0){
    System.out.println("Both first and second numbers are zeroes so any operation will result in 0");
    }
    else if(n1>=0 && n2>0){
        System.out.println("sum is "+ (n1+n2));
        System.out.println("difference is "+ (n1-n2));
    }
    else 
    System.out.println("Not performing any operations for negative numbers");

        

    }
}
