public class pgm6 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int target[]= createTargetArray(nums,index);
        for(int num:target)
        {
            System.out.println(num+" ");
        }
    }
    public static int[]  createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int i = 0, k = 0;
        while (i < index.length) {
           for (k = target.length - 1; k > index[i]; k--)
               target[k] = target[k - 1];
           target[index[i]] = nums[i];
           i++;
       }
       return target;
   }
}
