import java.util.ArrayList;
import java.util.List;

public class pgm1{
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> x1 = new ArrayList<Integer>();
        int x= matrix.length;
        int y= matrix[0].length;
        int[][] mat= new int[x][y];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                   mat[x-3][y-3]=matrix[i][j];      
                   mat[x-2][y-1]= matrix[i][j];
                
                x1.add(mat[i][j]);
                System.out.println(mat[i][j]);

            }
        }

        return x1;
    }
}