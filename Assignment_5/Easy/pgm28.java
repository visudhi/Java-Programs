/*Minimum Cost to Move Chips to The Same Position  
problem link:https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/ */ 

public class pgm28 {
    public static void main(String[] args) {
        
    }
    public static int minCostToMoveChips(int[] position) {
        
    int minEvenCost=0,minOddCost=0;
    for(int i:position)
    {
        if(i%2==0)
            {
                minEvenCost++;
            }
        else
            {
                minOddCost++;
            }
    }
        return Math.min(minOddCost,minEvenCost);
    }
}
