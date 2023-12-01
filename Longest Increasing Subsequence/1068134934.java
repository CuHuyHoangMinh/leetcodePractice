class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        for (int i = 0;i<nums.length;i++){
            boolean check = false;
            for (int j = 0;j<re.size();j++){
                // System.out.println(i+", "+j+": "+nums[i]+" "+re.get(j)+" "+re.size());

                if (re.get(j) >= nums[i]){
                    check = true;
                    re.set(j,nums[i]);
                    break;
                }
            }
            if (!check) re.add(nums[i]);
        }
    // for (int i: re)
    // {
    //     System.out.println(i);
    // }
    return re.size();
    }
}