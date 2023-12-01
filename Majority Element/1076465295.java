class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int freq = 0;
        for (int i: nums){
            if (i!=candidate) freq--;
            else freq++;
            if (freq<0) {
                candidate = i;
                freq = 1;
            }

        }
        return candidate;
        
    }
}