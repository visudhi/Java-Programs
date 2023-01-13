//Take name as input and print a greeting message 
//for that particular name.
import java.util.Scanner;

public class pgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name= sc.next();
        System.out.println("hi "+name+" merry christmas!");
    }
}
