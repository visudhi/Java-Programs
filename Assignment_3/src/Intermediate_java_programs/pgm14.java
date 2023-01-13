//pgm to calculate avg marks

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm14
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int noOfSubjects;
        double marks[],sum=0,avg;
        System.out.println("Enter the no of subjects");
        noOfSubjects=sc.nextInt();
        System.out.println("enter the marks");
        // double x=Double.parseDouble(noOfSubjects);
        marks=new double[(int) noOfSubjects];
        
        for(int i=0;i<noOfSubjects;i++)
        {
            marks[i]=sc.nextDouble();
        }

        System.out.println("The entered marks are ");
        for(int i=0;i<noOfSubjects;i++)
        {
        System.out.println(marks[i]);
        sum+=marks[i];
        }
        System.out.println("The sum of marks of all the subjects are "+sum);

        avg=(sum)/(noOfSubjects);
        System.out.println("The avg marks of all the subjects are "+avg);

        sc.close();

    }
}