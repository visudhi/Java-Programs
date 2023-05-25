/*Plus One (https://leetcode.com/problems/plus-one/) */

import java.util.ArrayList;
import java.util.List;

public class pgm26 {
    public static void main(String[] args) {
        int[] digits1={1};
        int[] y1=plusOne(digits1);
        for(int x2:y1)
        {
            System.out.println((x2));
        }
    }

    public static int[] plusOne(int[] digits)
        {
        List<Integer> x= new ArrayList<Integer>();
        int[] result= new int[digits.length];
        int sum=0;
    
        for(int i=0;i<digits.length;i++)
        {
            if(digits.length==1)
            {
                x.add(digits[i]);
                sum+=x.get(digits[i]);
                System.out.println(sum);
            }

        }

        return result;
        }

    



}
