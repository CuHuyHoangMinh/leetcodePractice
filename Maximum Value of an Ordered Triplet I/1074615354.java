class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        int n = nums.length;
        for (int i = 0; i<n-2;i++){
            for (int j = i+1;j<n-1;j++){
                for (int k = j+1;k<n;k++){
                    long temp = (long)(nums[i]-nums[j])*nums[k];
                    if (temp>max) max = temp;
                }
            }
        }
        return max;
    }
}