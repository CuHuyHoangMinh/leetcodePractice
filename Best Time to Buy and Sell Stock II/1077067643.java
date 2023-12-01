class Solution {
    public int maxProfit(int[] prices) {
        int count = 0;
        int re = 0;
        int ind = 0;
        int n = prices.length;
        while (ind<n){
            while (ind <n-1 && prices[ind]>prices[ind+1]) ind++;
            int temp = ind;
            if (temp == n-1) break;
            while (ind < n-1 && prices[ind]<=prices[ind+1]) ind++;
            re = re + prices[ind] - prices[temp];
            if (ind == n-1) break;
            ind++;
        }

        return re;
    }
}