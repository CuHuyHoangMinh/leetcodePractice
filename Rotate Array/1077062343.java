class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
		rev(nums,0,nums.length-1);
		rev(nums,0,k-1);
		rev(nums,k,nums.length-1);
    }
    void rev(int [] nums, int x, int y) {
		
		while (x< y) {
			int temp = nums[x];
			nums[x] = nums[y];
			nums[y] = temp;
			x ++;
			y --;
		}
	}
}