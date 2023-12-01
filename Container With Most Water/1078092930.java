class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int l= 0;
        int r = n-1;
        while (l<r){
            int val = Integer.min(height[l],height[r]) * (r-l);
            if (val > max) max = val;
            if (height[l]<height[r]) l++;
            else r--;
        }
        return max;
    }
}