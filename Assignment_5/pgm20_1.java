public class pgm20 {
    public static void main(String[] args) {
        int[][] mat={{0,1},{1,1}};
        int[][] target={{1,0},{0,1}};
        System.out.println(findRotation(mat, target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=mat[i][mat[0].length-j-1];
                
            }
            if(mat!=target)
            {
                return false;
            }
        }
        return true;
    }
}
