//Define two methods to print the maximum and the minimum number 
//respectively among three numbers entered by the user.
import java.util.Scanner;
class pgm1
{
public static void main(String[] args)
    {
          int first,second,third,largest,smallest;
          Scanner sc= new Scanner(System.in);
          System.out.println("enter the first number");
          first=sc.nextInt();
          System.out.println("enter the second number");
          second=sc.nextInt();
          System.out.println("enter the third number");
          third=sc.nextInt();
          sc.close();
          largest=Largest(first,second,third);
          smallest=Smallest(first,second,third);

          System.out.println("The largest number is "+largest);
          System.out.println("The smallest number is "+smallest);


    }

    static int Largest(int x1,int x2,int x3)
    {
        if(x1>x2 && x1>x3)
        {
            return x1;
        }
        else if(x2>x1 && x2>x3)
        {
            return x2;
        }
        else
        {
            return x3;
        }
        
    }

    static int Smallest(int x1,int x2,int x3)
    {
        if(x1<x2 && x1<x3)
        {
            return x1;
        }
        else if(x2<x1 && x2<x3)
        {
            return x2;
        }
        else
        {
            return x3;
        }
    }
}