/*Write a function to check if a given triplet is a 
Pythagorean triplet or not. 
(A Pythagorean triplet is when the sum of the 
square of two numbers is equal to the square of the third number).*/
import java.util.Scanner;
public class pgm12
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        sc.close();
        isPythagoreanTriplet(x,y,z);
    }
    static void isPythagoreanTriplet(int x,int y,int z)
    {
        int res=(int)Math.pow(x, 2);
        int res1=(int)Math.pow(y, 2);
        int res2=(int)Math.pow(z, 2);

        if(res2==(res+res1))
            System.out.println("It is a  pythagorean triplet");
        else
            System.out.println("It is not a  pythagorean triplet");
    }

}
