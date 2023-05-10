import java.util.Arrays;

public class pgm22_1 {
    public static int[] sumZero(int n)
    {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
        {
            A[i] = i * 2 - n + 1;
        }
        return A;
    }
        public static void main(String[] args) 
        {
            int x[]= sumZero(2);
            for(int i=0;i<x.length-1;i++)
            System.out.println(Arrays.toString(x));
        }
}
