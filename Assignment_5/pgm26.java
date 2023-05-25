/* Plus One (problem link: https://leetcode.com/problems/plus-one/) */

public class pgm26 {
    public static void main(String[] args) {
        int[] digits1={1};
        int[] y1=plusOne(digits1);
        for(int x2:y1)
        {
            System.out.println((x2));
        }
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
   }
}
