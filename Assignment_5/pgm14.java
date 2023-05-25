public class pgm16 {
    public static void main(String[] args) {
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(3,2,indices));
        

    }
    public static int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int row[] = new int [m];
        int col[] = new int [n];
        
        for(int x[] : indices)
        {
            row[x[0]]++;
            col[x[1]]++;
            System.out.println(col[x[1]]);
        }    
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if((row[i]+col[j])%2!=0)
                    count++;
            }        
        return count;
    }


}
