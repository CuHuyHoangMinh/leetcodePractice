class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] re = new int [nums.length];
        // Array.fills(1);
        int left = 1;
        re[0] = 1;
        for (int i = 1;i<nums.length;i++){
            left = left*nums[i-1];
            re[i] = left;
        }
        int right = 1;
        for (int i = nums.length-2;i>=0;i--){
            right = right*nums[i+1];
            re [i] = re[i]*right;
        }
        return re;
    }
}