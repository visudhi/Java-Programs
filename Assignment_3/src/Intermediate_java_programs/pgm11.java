//(question link)-https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

 package Intermediate_java_programs;
public class pgm11 {
        
    int y,p=1,s=0;
    public int subtractProductAndSum(int n)
    {
       
        while(n!=0)
        {
        
            y=n%10;
            n=n/10;
            p=p*y;
            s+=y;   
        
        }
    return p-s;
        
        
        
    }
    public static void main(String[] args)
    {
            pgm11 ax= new pgm11();
            System.out.println(ax.subtractProductAndSum(234));
            
    }
}