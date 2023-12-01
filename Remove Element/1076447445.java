class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int n = nums.length;
        for (int i=0;i<n;i++){
            if (nums[i] != val){
                count++;
            }
        }
        for (int i = 0; i< n-1;i++){
            if (nums[i] == val){
                for (int j=i+1;j<n;j++){
                    if (nums[j]!= val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }
        return count;
    }
}