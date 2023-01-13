//Kunal is allowed to go out with his friends only on the even days of a given month. 
//Write a program to count the number of days he can go out in the month of August.
package Intermediate_java_programs;


public class pgm35 {
    public static void main(String[] args)
    {
        String month="august";
        int days,even_days=0;
        for(days=1;days<=31;days++)
        {
            if(days%2==0)
            {
             even_days+=1;

            }
           
        }
        
        System.out.println("No of days kunal can go out  "+"in "+month+ " is "+even_days);
        
    }
    
}
