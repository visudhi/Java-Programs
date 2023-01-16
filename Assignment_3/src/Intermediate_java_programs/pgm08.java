//pgm to find the depreciaton of a value

package Intermediate_java_programs;
import java.util.Scanner;

public class pgm08 {
    public static void main(String[] args) {
        long asset_cost,depreciaton_percentage,years,value;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the asset_cost");
        asset_cost=sc.nextLong();
        System.out.println("enter the depreciation percentage");
        depreciaton_percentage=sc.nextLong();
        System.out.println("enter the no of years");
        years=sc.nextInt();
        value=asset_cost;
        for(int i=0;i<years;i++){
            value=((100-depreciaton_percentage)*value)/100;
        System.out.println("after " +i+" years" + " value after depreciation is = "+ value);
        sc.close();
        }

    }

    
}