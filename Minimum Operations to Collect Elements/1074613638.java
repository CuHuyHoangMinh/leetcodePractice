class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> check= new HashSet<>();
        int n = nums.size();
        Collections.reverse(nums);
        int count =0;
        for (int i = 0;i<n;i++){
            if (nums.get(i)<=k && nums.get(i)>=1 && !check.contains(nums.get(i))){
                count++;
                check.add(nums.get(i));
            }
            if (count == k ){
                return i+1;
            }
        }
        return 0;

        
    }
}