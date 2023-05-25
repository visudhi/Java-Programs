public class pgm04{
    public static void main(String[] args) {
        int[][] accounts = new int[][] {{1,2,3},{3,2,1}};
        
        //[[1,2,3],[3,2,1]]
        maximumWealth(accounts);
        System.out.println(9>=1);
    }
    public static int maximumWealth(int[][] accounts) {
        int res=0;
        for(int i=0;i<accounts.length;i++)
        {
        int temp=0;
        for(int j=0;j<accounts[i].length;j++)
        {
            temp+=accounts[i][j];
        }
        res = Math.max(res,temp);
        }
        return res;
    }
}

