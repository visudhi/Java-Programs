public class pgm19 {
    public static void main(String[] args) {
        int[] nums={437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int [] arr= new int[nums.length];
        int c=0,n=0;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            while(nums[i]!=0)
            {
               nums[i]=nums[i]/10;
               c++;

            }
            arr[i]=c;
            
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                n++;
            if(arr[i]%2!=0)
                n+=0;
            else
                n+=0;
        }
        return n;
    }
}
