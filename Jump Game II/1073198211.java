class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n==1) return 0;
        int [] maxPos = new int [n];
        for(int i = 0;i<n;i++){
            maxPos[i] = i + nums[i];
        }
        int max = maxPos[0];
        int cap = nums[0];
        int re = 1;
        int count = 0;
        int temp = 0;
        for (int i = 1;i<n-1;i++){
            if (maxPos[i]>max) {
                max = maxPos[i];
                temp = nums[i];
            }
            // count++;
            if (i == cap){
                cap = max;
                // count = 0;
                re++;
            }
        }
        return re;
        
    }
}