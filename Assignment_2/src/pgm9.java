//To find Armstrong Number from a given number.
import java.util.Scanner;

public class pgm9 {
    private static Scanner sc;
    public static void main(String[] args) {
        int Number,Temp,Reminder,Times=0;
        double Sum=0;
        sc= new Scanner(System.in);
        System.out.println("Please enter number to check");
        Number=sc.nextInt();
        Temp=Number;
        while(Temp!=0){
            Times=Times+1;
            Temp=Temp/10;
        }
        Temp=Number;
        while(Temp>0){
            Reminder=Temp%10;
            Sum=Sum+Math.pow(Reminder, Times);
            Temp= Temp/10;

        }
        System.out.println(" Sum of entered is = %.2f "+Sum);
        if(Sum==Number)
        System.out.println(" %d is Armstrong number "+Number);
        else
        System.out.println(Number+" is not armstrong number");


    }
}
