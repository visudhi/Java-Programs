import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pgm8 {
    public static void main(String[] args) {
        int[] nums={8,8,1,2,2,3};
        int ans[]=smallerNumbersThanCurrent(nums);

        for(int num:ans)
        {
            System.out.println(num+" ");
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) 
    {
        List<Integer> res= new ArrayList<>(nums.length);
        int count[]  = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res.add(nums[i]);
        }
        Collections.sort(res);
        System.out.println(res);

        for(int i=0;i<nums.length;i++)
        {
            count[i]=res.indexOf(nums[i]);
        }
        
        return count;
            
    }
}
