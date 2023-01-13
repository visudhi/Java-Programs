//pgm to find cgpa 

package Intermediate_java_programs;
import java.util.Scanner;
public class pgm12
{
public static void main(String[] args)
    {  
    CGPA cgpa = new CGPA();
    cgpa.getData();
    }

}

class CGPA
{
    Scanner sc= new Scanner(System.in);
    double cgpa,sumOfMarks=0;
    int n;
    String subjects[];
    double marks[];
    void getData()
        {
            System.out.println("enter the no of subjects");
            n=sc.nextInt();
            notNegative1();

            System.out.println("enter the subjects");
            subjects= new String[n];
            for(int i=0;i<subjects.length;i++)
                {
                    subjects[i]=sc.next();
                }

            System.out.println("The entered subjects are:");
            for(int i=0;i<subjects.length;i++)
                {
       
                    System.out.println(subjects[i]+"\n");
                }
        
            System.out.println("Enter the marks for the entered subjects in order");
            marks= new double[n];
            for(int i=0;i<subjects.length;i++) // for(String s:subjects) also works
                {
                        marks[i]=sc.nextDouble();
                        notNegative2();    
                }
            for(int i=0;i<subjects.length;i++) // for(String s:subjects) also works
            System.out.println(subjects[i] +" = "+marks[i]+" marks");
            calculate();

        }

    void notNegative1()
        {
            while(n<0)
            {
                System.out.println("No of subjects cannot be negative! Please enter a positive value!"); 
                System.out.println("enter the no of subjects");
                n=sc.nextInt();

            } 
           
        }

    void notNegative2()
        {
            for(int i=0;i<subjects.length;i++)
            while(marks[i]<0)
            {
                System.out.println(" No negative marking in this exam! Please enter a positive value!");
                System.out.println("enter the marks for the subject no"+i);
                marks[i]=sc.nextDouble(); 
            }
        }
    void calculate()
        {
            for(double x:marks)
            {
                        sumOfMarks+=x;
            }
            cgpa=(sumOfMarks)/(n*10);
            System.out.println("Cgpa of the student is "+cgpa);
            display();
        }

    void display()
        {

            if(cgpa>=7.5 || cgpa<=10.0)
            {
                System.out.println("Student has passed in First class with Distinction");
        
            }
            else if(cgpa>=6.0 || cgpa<=7.4)
            {
                System.out.println("Student has passed in First class");
        
            }
            else if(cgpa>=3.6 || cgpa<=5.9)
            {
                System.out.println("Student has passed in Second class");
        
            }
            else if(cgpa>0.0 || cgpa<=3.5)
            {
                System.out.println("Student has passed in pass class");
        
            }
            else
            {
                System.out.println("student has failed!!");
            }
           
        }
        

}