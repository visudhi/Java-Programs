import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than 
//or equal to 18. 
//Define a method to find out if he/she is eligible to vote.
public class pgm03 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int x= sc.nextInt();
        sc.close();
        Age(x);
    }

    static void Age(int x1)
    {
        if(x1>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
        

    }
}
