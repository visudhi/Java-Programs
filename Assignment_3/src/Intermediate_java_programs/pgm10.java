//pgm to find the batting average using functions (pgm9 extended)

package Intermediate_java_programs;
import java.util.Scanner;


public class pgm10
{
    public static void main(String[] args)
    {
        X x= new X();

        x.getData();
    }
}
    
class X
    {
        Scanner sc= new Scanner(System.in);
        double sum_of_scores=0,scores[],innings_played=0,matches,batting_average,notout;
        String name;

        void getData()
        {
                System.out.println("enter the name of the batter");
                name=sc.nextLine();
                System.out.println("enter the matches played");
                matches=sc.nextDouble();

            while(matches<0)
            {
                System.out.println("please enter a positive value for matches played!");
                matches=sc.nextDouble();
            }

                System.out.println("enter the total no of innings the batter batted out of "+(int)matches+ " matches played");
                innings_played=(int)sc.nextDouble();
                calculate();
        }

        void calculate()
        {

            while(innings_played<0)
            {
                System.out.println("innings played cannot be less than 0! It cannot be negative");
                System.out.println("please enter a positive value");
                innings_played=(int)sc.nextDouble();
            }
            while(innings_played>matches)
            {
                System.out.println("Innings cannot be greater than no of matches played\n");
                // innings_played=0;
                // matches=0;
                break;   
            } 

            while(innings_played<=matches)
            {
                getData1();
                batting_average=(sum_of_scores)/(innings_played-notout);
                break;
            }
 
        }

        void getData1()
        {
                System.out.println("enter the no of times the batter is notout in "+(int)innings_played+ " innings played");
                notout=sc.nextInt();
            while(notout<0)
            {
                System.out.println("No of times a batter is not-out cannot be negative!");
                System.out.println("please enter a positive value");
                notout=sc.nextInt();
            }
            while(notout>innings_played)
                {
                    getData1();
                    break;
                }
                System.out.println("enter the scores");
                scores=new double[ (int) innings_played];
            for(int i=0;i<scores.length;i++)
                {
                    scores[i]=sc.nextDouble();
                }

            for(int i=0;i<scores.length;i++)
                {
                sum_of_scores+=scores[i];
                }

            display();
        }
        
        void display()
        {
           
                System.out.println("\n");
                System.out.println(" Batter Statistics based on user input");
                System.out.println(" The scores in "+(int)innings_played + " innings"+" out of "+ (int)matches+" matches are");
            for(double x:scores)
            {
                System.out.println("\t"+(int)x);
            }
                System.out.println(" The batsman name is    : "+name);
                System.out.println(" No of matches played is: "+(int)matches);
                System.out.println(" No of innings played out of "+(int)matches+" matches is: "+ (int)innings_played);
                System.out.println(" The total score in "+ (int)innings_played + " innings"+" out of "+ (int)matches+" matches"+ " is "+ (int)sum_of_scores);
    
        }

    }