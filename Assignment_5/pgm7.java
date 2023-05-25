public class pgm7 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        numIdenticalPairs(nums);
    }

    public static int numIdenticalPairs(int[] nums) {
        int res = 0, count[] = new int[101];
        for (int a: nums) {
            res += count[a]++;// res=res+count[a]// res=res+count[a]++;// res= res+count[a];//count[a]++;
            //count[a]++;
        }
        return res;
    }
}
/* Solution 2: Think what we are doing in last solution, we are calculating how many time nums[i] occur before ith index.
So if store occurance of nums[i] in some container lets say array as N <= 100 or hashmap. Then we can remove inner
loop, and simply do ans += count[nums[i]]. TC:O(N), SC:O(1), 100 is fixed size array !!

class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int count[101] = {0}, ans = 0;
        for(int i=0; i<nums.size(); i++){
            if(count[nums[i]] != 0){
                ans += count[nums[i]];
            }
            count[nums[i]]++;
        }
        return ans;
    }
}; */