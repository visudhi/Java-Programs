/*Write a program that will ask the user to enter his/her marks 
(out of 100). Define a method that will display 
grades according to the marks entered as below:

 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail */

import java.util.Scanner;
public class pgm08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int x= sc.nextInt();
        sc.close();
        Marks(x);
        
    }
    static void Marks(int x)
    {
        if(x>=91 && x<=100)
        System.out.println("Grade is AA");

        else if(x>=81 && x<=90)
        System.out.println("Grade is AB");

        else if(x>=71 && x<=80)
        System.out.println("Grade is BB");

        else if(x>=61 && x<=70)
        System.out.println("Grade is BC");

        else if(x>=51 && x<=60)
        System.out.println("Grade is CD");

        else if(x>=41 && x<=50)
        System.out.println("Grade is DD");

        else if(x<=40)
        System.out.println("Fail");


    }
}
