class Solution {
    public int maxProfit(int[] prices) {
        int runMin = Integer.MAX_VALUE;
        int max = 0;
        for (int i:prices){
            if (i>runMin){
                if (i-runMin > max) max = i - runMin;
            }
            if (i<runMin){
                runMin = i;
            }
        }
        return max;
    }
}