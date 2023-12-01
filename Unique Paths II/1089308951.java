class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] dp = new int[n][m];
        if (grid[0][0] == 1) return 0;
        int val = 1;
        for (int i = 0; i<n;i++){
            if (grid[i][0] == 1) val = Integer.MAX_VALUE;
            dp[i][0] = val;
        }
        val = 1;
        for (int i = 0; i<m;i++){
            if (grid[0][i] == 1) val = Integer.MAX_VALUE;
            dp[0][i] = val;
        }
        for (int i=0;i<n;i++){
            for (int j = 0;j<m;j++){
                if (grid[i][j] == 1) dp[i][j] = Integer.MAX_VALUE;
            }
        }

        // for (int i = 0;i<n;i++){
        //     for (int j = 0; j<m ; j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        for (int i = 1; i<n;i++){
            for (int j = 1;j<m;j++){
                if (grid[i][j] == 0) {
                    if (valid(i-1,j,n,m,dp) == Integer.MAX_VALUE && valid(i,j-1,n,m,dp) == Integer.MAX_VALUE ) dp[i][j] = Integer.MAX_VALUE;
                    else if (valid(i-1,j,n,m,dp)== Integer.MAX_VALUE ) dp[i][j] = valid(i,j-1,n,m,dp);
                    else if ( valid(i,j-1,n,m,dp) == Integer.MAX_VALUE) dp[i][j] = valid(i-1,j,n,m,dp);
                    else dp[i][j] = valid(i-1,j,n,m,dp) + valid(i,j-1,n,m,dp);
                }
            }
        }
        // for (int i = 0;i<n;i++){
        //     for (int j = 0; j<m ; j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int )
        return dp[n-1][m-1]==Integer.MAX_VALUE?0:dp[n-1][m-1];
    }

    public int valid(int x,int y,int n,int m, int [][]dp){
        if (x>=n) return Integer.MAX_VALUE;
        if (y>=m) return Integer.MAX_VALUE;
        if (x<0) return Integer.MAX_VALUE;
        if (y<0) return Integer.MAX_VALUE;
        if (dp[x][y] == Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return dp[x][y];
    }
}