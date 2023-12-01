class Solution {
    public int minimumSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int min= Integer.MAX_VALUE;
        Arrays.fill(l, Integer.MAX_VALUE);
        Arrays.fill(r, Integer.MAX_VALUE);
        for (int i =0;i<n;i++) {
        	if (nums[i]<min) min = nums[i];
        	l[i] = min;
        }
        min= Integer.MAX_VALUE;
        for (int i =n-1;i>0;i--) {
        	if (nums[i]<min) min = nums[i];
        	r[i] = min;
        }
        min= Integer.MAX_VALUE;
        for (int i = 0;i<n;i++) {
        	// System.out.println(l[i]+" "+r[i]);
        	sum = l[i] + r[i]+nums[i];
        	if (nums[i]>l[i] && nums[i]>r[i]) {
        		if (sum<min) min = sum;
        	}
        }
        return min==Integer.MAX_VALUE?-1:min;
 
    }
}