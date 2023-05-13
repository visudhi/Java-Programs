public class pgm24 {
    public static void main(String[] args) 
    {
        int [] arr={2,-4,3,-1,2};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int sum = 0;//sum= Max_Ending_Here
        int maxSum = Integer.MIN_VALUE;// MaxSum=Max_So_Far
        
        int start = 0, end = 0;
        int tempStart = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
            if (maxSum < sum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }
        
        System.out.print("[");
        for (; start <= end; start++)
            System.out.print(" " + arr[start] + " ");
        System.out.println("]");
        
        return maxSum;
    }
}