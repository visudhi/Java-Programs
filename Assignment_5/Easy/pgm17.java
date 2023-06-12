/*Transpose Matrix (Problem Link: https://leetcode.com/problems/transpose-matrix/) */

import java.util.Arrays;

public class pgm17 {
    public static void main(String[] args) {
        int[][] image={{1,2,3},{4,5,6},{7,8,9}};
        int [][] image1= transpose(image);
        for(int[] image2:image1)
        System.out.println(Arrays.toString(image2));
    }
    public static int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] mat1=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    mat1[i][j]=matrix[i][j];
                }

                if(i!=j)
                {
                   mat1[j][i]=matrix[i][j];
                }

            }
        }
        return mat1;
    }
}
