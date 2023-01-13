//pgm to calculate elctricity bill

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm2
{
    public static void main(String[] args) 
    {
        customerdata obj= new customerdata();
        obj.getdata();
        obj.calc();
        obj.display();

    }

}
class customerdata 
{
    Scanner in= new Scanner(System.in);
    Scanner ins = new Scanner(System.in);
    String cname,type;
    int bn;
    double current,previous,tbill,units;

    void getdata()
    {
        System.out.println("Enter consumer number");
        
        bn=in.nextInt();
        
        System.out.println("enter type of connection d for domestic or c for commercial");
        
        type=ins.nextLine();
        
        System.out.println("enter consumer name ");
        
        cname=ins.nextLine();
        
        System.out.println("enter previous month reading ");
        
        previous=in.nextDouble();
        
        System.out.println("enter current month reading ");
        
        current=in.nextDouble();

    }

    void calc()
    {
        units=current-previous;
        if(type.equalsIgnoreCase("D"))
        {
            if(units<=100)
                tbill=1*units;
            else if(units>100 && units<=200)
                tbill=2.50*units;
            else if(units>200 && units<=500)
                tbill=4*units;
            else
                tbill=6*units;
        }
        else  if(type.equalsIgnoreCase("C"))
        {
        if(units<=100)
            tbill=2*units;
        else if(units>100 && units<=200)
            tbill=4.50*units;
        else if(units>200 && units<=500)
            tbill=6*units;
        else 
            tbill=7*units;

        }
    }

    void display()
    {
        System.out.println("consumer number= "+bn);
        System.out.println("consumer name "+cname);
        if(type.equalsIgnoreCase("D"))
        System.out.println("type of connection = Domestic");
        else
        System.out.println("type of connection = commercial");
        System.out.println("current month reading = "+current);
        System.out.println("previous month reading = "+previous);
        System.out.println("total units = "+units);
        System.out.println("total bill = rs "+tbill);


    }
}