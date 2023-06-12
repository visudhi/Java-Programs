/* removing duplicates from array by maintaining maximum frequency array */

public class pgm27_2 {
    public static void main(String[] args) {
        int [] x={0,0,0,0,0,0,0};
        int n= x.length;
        n=removeDuplicates(x);
        for(int i=0;i<n;i++)
        {
            System.out.println(x[i]+"");
        }
    }

    public static int removeDuplicates(int[] nums)
    {
        int n=nums.length;
        int i,m=0,j=0;
        for(i=0;i<n;i++)
        {
            m=Math.max(m, nums[i]);
        }
        int[] f= new int[m+1];

        for(i=0;i<n;i++)
        {
            f[nums[i]]++;
        }

        for(i=0;i<m;i++)
        {
            if(f[i]>0)
            {
                f[j++]=nums[i];
                
            }
            
        }
        f[j++]=nums[n-1];
        
        for(i=0;i<j;i++)
        {
            nums[i]=f[i];     
        }
        return i;
        
    }
}
