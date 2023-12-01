class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int [] dp = new int[amount+1];
        HashSet<Integer> set = new HashSet<>();
        dp[0] = 0;
        for (int i=1;i<=amount;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i : coins){
            if (i<=amount){
                dp[i] = 1;
                set.add(i);
            }
            
        }

        for (int i = 1;i<=amount; i++){
            int min = dp[i];
            for (int coin: coins){
                if (i>coin){
                    if (dp[i-coin]!=Integer.MAX_VALUE)
                        if (dp[i-coin]+1 < min) min = dp[i-coin] +1;
                }
            }
            if (min!=Integer.MAX_VALUE)
                dp[i] = min;
            
        }
        // for (int i = 0; i<=amount;i++){
        //     System.out.println(i+" "+dp[i]);
        // }

        return dp[amount]>0&&dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;
        
    }
}