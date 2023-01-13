//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class pgm5 {
    
    public static void main(String[] args) {
        
        double n1,n2;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        n1= sc.nextDouble();
        System.out.println("Enter another number");
        n2=sc.nextDouble();
        if(n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }
        else
        System.out.println(n2+" is greater than "+n1);

    }
}
