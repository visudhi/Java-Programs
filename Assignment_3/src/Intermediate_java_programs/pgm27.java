//program to find whether a string is palindrome or not

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm27 
{
    public static void main(String[] args) 
    {
        ok x1= new ok();
        x1.input();
    }
}

    class ok
    {
        String v,v1="";
        void input()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a string");
            v=sc.next();
            
            checkInputForNullOrEmpty();
            sc.close();
            
        }
        void checkInputForNullOrEmpty()
        {
            if((v==null || v.length()<=1))
                System.out.println(v);
            else
            {
            palindromeCheck();
            }
        }
        void palindromeCheck()
        {
            
            for(int i=0;i<v.length();i++)
            {
                char ch=v.charAt(i);
                v1=ch+v1;
            }
            isPalindrome();

        }
        void isPalindrome()
        {
            if(v.equals(v1))
            {
                System.out.println("It is a palindrome!!!!");
                System.out.println("input string "+v+" = = "+" output string "+ v1);
            }
            else
            {
            System.out.println("It is not a palindrome!!!!");
            System.out.println("input string "+v+" ! = "+" output string "+ v1);
            }

        }
    }
