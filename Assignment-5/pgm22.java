import java.util.Arrays;

public class pgm22 {
    public static int[] sumZero(int n)
    {

            int[] res = new int[n];
            int left = 0, right = n - 1, start = 1;
            while (left < right) 
            {
                res[left++] =   start;
                res[right--] = -start;
                start++;
            }
            return res;
    }
        
    
    public static void main(String[] args) {
        int x[]= sumZero(3);
        for(int i=0;i<x.length-(x.length-1);i++)
        System.out.println(Arrays.toString(x));
       
    }
    
}
