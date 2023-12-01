class Solution {
    public int findKOr(int[] nums, int k) {
        int pow2 = 1;
        if (k == nums.length) {
            int re = nums[0];
            for (int i :nums) re = re & i;
            return re;
        }
        if (k == 1){
            int re = nums[0];
            for (int i :nums) re = re | i;
            return re;
        }
        
        int re = 0;
        int exit = 0;
        int n = nums.length;
        while (exit<n){
            int count = 0;
            exit = 0;
            for (int i = 0; i<nums.length; i++){
                // System.out.print(nums[i] +" ");
                if (nums[i] == 0 ) exit++;

                if (nums[i] != 0 && nums[i] %2 == 1 ){
                    count++;
                }
                nums[i] = nums[i] / 2;
                // if (count >= k) break;
            }
            // System.out.println();
            // System.out.println(count);
            if (count >= k) re = re+ pow2;
            pow2 = pow2 * 2;
        }
        
        return re;
        
    }
}