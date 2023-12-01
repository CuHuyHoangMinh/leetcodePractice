class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n==1) return true;
        if (nums[0]==0) return false;
        int max = 0;
        for (int i=0;i<n;i++){
            if (i>max) return false;
            if (max<i+nums[i]) max = i+nums[i];
        }
        return true;

        
    }
}