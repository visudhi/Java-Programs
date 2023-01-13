//pgm to reverse a string using arraylist object

package Intermediate_java_programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class pgm24 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String y="";
        System.out.println("enter a string");
        String x = sc.next();
        char[] x1= x.toCharArray();
        sc.close();
        List<Character> x2= new ArrayList<>();

        for(char c:x1)
        {
            x2.add(c);
        }
        Collections.reverse(x2);
        ListIterator<Character> x3=x2.listIterator(); //just using ListIterator may cause warnings so used Character as a parameter
        while(x3.hasNext())
        System.out.println(x3.next());

        // to convert list to string
        StringBuilder builder= new StringBuilder();
        for(Character ch: x2){
            builder.append(ch);
        }

        y=builder.toString();
        System.out.println(y);
        
    }
}