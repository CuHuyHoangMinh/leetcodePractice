class Solution {
    public int minimumSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i =0;i<n-2;i++) {
        	for (int j=i+1;j<n-1;j++) {
        		for (int k= j+1;k<n;k++) {
        			if (nums[j]>nums[k] && nums[j]>nums[i]) {
        				sum = nums[i] + nums[j] + nums[k];
        				if (sum<min) min = sum;
        			}
        		}
        	}
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}