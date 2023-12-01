class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int [] re = new int [2];
        for (int i=0;i<nums.length;i++){
            if (m.containsKey(target-nums[i])){
                re[0] = i;
                re[1] = m.get(target-nums[i]);
            } else{
                m.put(nums[i],i);
            }
        }
        return re;
        
    }
}