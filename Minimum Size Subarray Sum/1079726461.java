class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = -1;
        int n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (true ){
            if (sum<target){
                r++;
                if (r>=n) break;
                sum = sum+nums[r];
            } else{
                if (r-l + 1 < min) min = r-l+1;
                if (l>=n) break;
                sum = sum - nums[l];
                l++;
            }
            System.out.println(l +" " + r +" "+ sum +" " + min);

        }
        return min==Integer.MAX_VALUE?0:min;
        
    }
}