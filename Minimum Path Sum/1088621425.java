class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] dp = new int[n][m];
        for (int i = 0;i<n;i++ )
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        dp[0][0] = grid[0][0];
        for (int i = 0; i<n;i++){
            for (int j = 0;j<m;j++){
                if (valid(i+1,j,n,m)){
                    dp[i+1][j] = Integer.min(grid[i+1][j] + dp[i][j],dp[i+1][j]);
                }
                if (valid(i-1,j,n,m)){
                    dp[i-1][j] = Integer.min(grid[i-1][j] + dp[i][j],dp[i-1][j]);
                }
                if (valid(i,j+1,n,m)){
                    dp[i][j+1] = Integer.min(grid[i][j+1] + dp[i][j],dp[i][j+1]);
                }
                if (valid(i,j-1,n,m)){
                    dp[i][j-1] = Integer.min(grid[i][j-1] + dp[i][j],dp[i][j-1]);
                }
            }
        }

        // for (int )
        return dp[n-1][m-1];
        
    }
    public boolean valid(int x,int y,int n,int m){
        if (x>=n) return false;
        if (y>=m) return false;
        if (x<0) return false;
        if (y<0) return false;
        return true;
    }
}