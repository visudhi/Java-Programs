import java.util.Arrays;

public class pgm22_2 {

        public static int[] sumZero(int n) {
            int arr[] = new int[n];
            int sum = 0;
            for(int i = 0; i < n-1; i++) {
                arr[i] = i+1;
                sum += arr[i];
            }
            arr[n-1] = -sum;
            return arr;
        }
    
    public static void main(String[] args) {
        int x[]= sumZero(3);
        for(int i=0;i<x.length-(x.length-1);i++)
        System.out.println(Arrays.toString(x));
    }
}
