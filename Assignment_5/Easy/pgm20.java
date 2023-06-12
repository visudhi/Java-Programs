//Link to the problem: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

class pgm20{
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] target={{1,1,1},{0,1,0},{0,0,1}};
        System.out.println(findRotation(mat,target));
    }
    
    public static boolean findRotation(int[][] mat, int[][] target) {
     
        for(int i=0; i<4; i++){
        if(isEqual(mat,target)) return true;
        mat = rotate(mat);
        }
        return false;
    }
    
    
//     Function to rotate matrix by 90 degree using transpose
    public static int[][] rotate(int[][] mat){
          int[][] check = mat;   
          int m = check.length;
//             First transposing the matrix
            for(int col=0; col<m; col++){
                for(int row=1+col; row<m; row++){
                    int temp = check[row][col];
                    check[row][col] = check[col][row];
                    check[col][row] = temp;
                }
                //[1,0]                             [0,1]                                          [1,0]
                //[0,2]     after transpose ====    [2,0]          after swapping columns  ======  [0,2]

                //Arrays.deepEquals is used for matrices
            }
        
//             Now swapping coloumns like said in start
            for(int col_1 = 0 , col_2=m-1; col_1<m/2; col_1++,col_2--)
            {
            for(int row= 0; row<m; row++)
            {
                int temp = check[row][col_1];
                check[row][col_1] = check[row][col_2];
                check[row][col_2] = temp;;
            }
        }
        return check;
    }
    
    
//     Function to check whether two matrix are equal
    public static boolean isEqual(int[][] m1 , int[][] m2){
        if(m1.length != m2.length) return false;
        if(m1[0].length != m2[0].length) return false;
        for(int row=0; row<m1.length; row++){
            for(int col = 0; col<m1[0].length; col++){
                if(m1[row][col] != m2[row][col]) return false;
            }
        }
        return true;
    }
    
}