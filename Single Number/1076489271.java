class Solution {
    public int singleNumber(int[] nums) {
        int re = 0;
        for (int i: nums) re = re^i;
        return re;
    }
}