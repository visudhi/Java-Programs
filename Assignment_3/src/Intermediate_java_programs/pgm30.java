//pgm to find lcm between 2 nos 

package Intermediate_java_programs;

public class pgm30
{
    public static void main(String[] args)
    {
        int n1=72,n2=120, lcm;
        lcm= (n1>n2)? n1:n2;

        while(true)
        {
            if(lcm%n1==0 && lcm%n2==0)
            {
                System.out.println("The lcm of "+n1+ " and " +n2+ " is "+lcm);
                break;
            }
            ++lcm;
        }
    }
}
