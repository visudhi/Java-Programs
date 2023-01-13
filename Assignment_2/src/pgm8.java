//To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class pgm8 {
    public static void main(String[] args) {
        String input1="";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String input= sc.nextLine();
        for(int i=0;i<input.length();i++){
            char x=input.charAt(i);
            input1=x+input1;
        }
       if(input.equals(input1))
       System.out.println(input+" is a palindrome");
       else
       System.out.println(input+ " is not a palindrome");
       
    }
}
