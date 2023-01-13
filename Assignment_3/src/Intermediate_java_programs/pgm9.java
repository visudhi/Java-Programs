//pgm to find the  batting average

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm9 {
    
    public static void main(String[] args) {
        double sum_of_scores=0,scores[],innings_played=0,matches,batting_average,notout;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the matches played");
        matches=sc.nextDouble();
        // System.out.println("enter the no of innings played");
        // innings_played=sc.nextInt();
        System.out.println("enter the no of times the batter is notout in "+(int)innings_played+ " innings played");
        notout=sc.nextInt();
        System.out.println("enter the total no of innings out of "+(int)matches+ " matches played");
        innings_played=(int)sc.nextDouble();
        System.out.println("enter the scores");
        scores=new double[ (int) innings_played];

        for(int i=0;i<scores.length;i++)
        {
            scores[i]=sc.nextDouble();
        }

        for(int i=0;i<scores.length;i++){
            sum_of_scores+=scores[i];

        }

        batting_average=(sum_of_scores)/(innings_played-notout);
        System.out.println("the batting_average is "+ (int)batting_average);
        sc.close();


    }
    
}