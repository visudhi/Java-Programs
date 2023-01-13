//pgm to Calculate Distance Between Two Points
package Intermediate_java_programs;
import java.util.Scanner;


public class pgm5 {
    public static void main(String[] args) {
       // (2,3)  (2,4)
       //sqrt([(x2-x1)^2)]+[(y2-y1)^2])
       int x1,x2,y1,y2;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the points to find the distance");
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
       int diff1=x2-x1;
       int diff2=y2-y1;
       double d=(int) Math.sqrt(Math.pow(diff1, 2)+(Math.pow(diff2, 2)));
       System.out.println("distance between the 2 points is "+d);
       sc.close();
    
}
}


