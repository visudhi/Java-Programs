//pgm to find fibonacci series

package basic_java_programs;
import java.util.Scanner;


public class pgm21 {
    public static void main(String[] args) {
        int firstTerm=0,secondTerm=1,nextTerm=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to generate fibonacci series");
        n=sc.nextInt();
        
        while(firstTerm<=n){
            System.out.println(firstTerm);
            nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;  
            sc.close();
        }

    }
}