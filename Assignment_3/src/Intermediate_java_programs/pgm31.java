//pgm to find if a letter is a vowel or consonant

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm31
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a letter");
        String x= sc.next();
        if(x.contains("a")||x.contains("e")||x.contains("i")||x.contains("o")||x.contains("u"))
        {
            System.out.println("It is a vowel");
        }
        else if(x.equalsIgnoreCase("a")||x.equalsIgnoreCase("e")||
        x.equalsIgnoreCase("i")||x.equalsIgnoreCase("o")|| x.equalsIgnoreCase("u"))
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is a consonant");
        }
        sc.close();

    }
}
