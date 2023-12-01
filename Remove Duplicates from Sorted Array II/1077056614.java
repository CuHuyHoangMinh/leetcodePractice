class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int n = nums.length;
        int p2 = 0;
        while (p2<n){
            int count = 1;
            while (p2<n-1&&nums[p2]==nums[p2+1]){
                if (count<3)
                {
                    nums[p1] = nums[p2];
                    p1++;
                }                
                count++;
                p2++;
            }
            if (count<3){
                nums[p1] = nums[p2];
                p1++;
                p2++;
            } else{
                p2++;
            }

        }
        
        return p1;       
    }
}