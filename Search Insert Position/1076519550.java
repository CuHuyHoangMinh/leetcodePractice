class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }
    public int search(int [] nums, int t, int l, int r){
        System.out.println(l+ " "+ r);
        if (l>r) return l;
        int mid =  l + (r-l)/2;
        if (nums[mid]<t) return search(nums,t,mid+1,r);
        if (nums[mid]>t) return search(nums,t,l,mid-1);
        return mid;

    }
}