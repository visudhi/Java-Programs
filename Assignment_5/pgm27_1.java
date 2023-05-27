/*Problem link: https://leetcode.com/problems/plus-one/  */
public class pgm27_1 {
    public static void main(String[] args) {
        int [] x={1,1,2};
        System.out.println(removeDuplicates(x));
    }
    public static int removeDuplicates(int[] nums) {
        int n= nums.length;
        int[] temp=new int[n];
        int j=0;
        if(n==0 || n==1){
            return n;
        }

        for(int i=0;i<n-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                temp[j++]=nums[i];
                // System.out.println(temp[j]);

            }
        }
        temp[j++]=nums[n-1];
        
        for(int i=0;i<j;i++)
        {
            nums[i]=temp[i];     
        }
        return j;

    }
}
