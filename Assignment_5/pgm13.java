import java.util.Arrays;

public class pgm15 {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
       int x2[][]=flipAndInvertImage(image);
       for(int[] x3:x2)
       {
        System.out.println(Arrays.toString(x3));
       }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        //List<ArrayList<Integer>> x= new ArrayList<ArrayList<Integer> >();
        int x1[][]= new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {   
            for(int j=0;j<image[0].length;j++)
            {
               x1[i][j]=image[i][image[0].length-j-1];
               //System.out.println(x1[i][j]);
            }
        }
        for(int i=0;i<image.length;i++)
        {   
            for(int j=0;j<image[0].length;j++)
            {
               x1[i][j]=x1[i][j]==1?0:1;
            }
        }

        return x1;
    }

}
