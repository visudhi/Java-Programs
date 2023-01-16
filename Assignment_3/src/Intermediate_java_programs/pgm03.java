//pgm to calculate avg of n numbers

package Intermediate_java_programs;
import java.util.Scanner;

//average of n numbers
public class pgm03 {
    public static void main(String[] args) {
        //x=1+2+3+4+5+6/6; x=n1+n2+n3+....+n/n
        int n,sum=0,avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quantity of numbers you want to find average of ");
        n=sc.nextInt();
        System.out.println("enter the  "+n+" numbers");
        int n1[]=new int[n];
       
        for(int i=0;i<n1.length;i++)
        {
            n1[i]=sc.nextInt();   
        }
        
        for(int i=0;i<n1.length;i++){
            sum+=n1[i];  
        }
        avg= ((sum)/(n));
        System.out.println("The avg of the entered " + n+ " nos is "+ avg);
        sc.close();
        
        
    
}
}



