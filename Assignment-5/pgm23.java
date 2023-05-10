/* Lucky Numbers in a matrix */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pgm23{

        public static List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] min= new int[m],max= new int[n];
        Arrays.fill(min, Integer.MAX_VALUE);
        System.out.println(min);
        
        for(int i=0; i<m; ++i)
        {
            for(int j=0; j<n; ++j)
            {
                //System.out.println(min[i]);
                min[i]=Math.min(matrix[i][j],min[i]);
                //System.out.println(max[j]);
                max[j]=Math.max(matrix[i][j],max[j]);
                System.out.println(min[i]);
                System.out.println(max[j]);
            }
        }

        List<Integer> x= new ArrayList<Integer>();
        for(int i=0; i<m; ++i)
        {
            for(int j=0;j<n;++j)
            {
                if(min[i] == max[j])
                {
                    x.add(min[i]);
                    break;
                }
            }
        }
        return x;
        }
    
    public static void main(String[] args)
    {
        int x[][]={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(x));
    }
}