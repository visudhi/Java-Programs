//Input currency in rupees and output in USD.
import java.util.Scanner;

public class pgm6 {
    public static void main(String[] args) {
        double rupees,usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees");
        rupees= sc.nextDouble();
        usd=(rupees/80);
        System.out.println("The entered rupees in dollars is "+usd);
    }
    
}
