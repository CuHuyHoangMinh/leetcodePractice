class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        int pointer = 1;
        // int prev = 0;
        int n = nums.length;
        int end = -1;
        ArrayList<String> re = new ArrayList<>();
        if (n == 0) return re;

        while (pointer<n){
            if ( nums[pointer] != nums[pointer -1 ] + 1 ){
                if (start == pointer-1){
                    re.add(""+nums[start]);
                } else{
                    re.add(nums[start]+"->"+nums[pointer-1]);
                }
                start = pointer;
            } 
            pointer++;
        }
        if (start == pointer-1){
            re.add(""+nums[start]);
        } else{
            re.add(nums[start]+"->"+nums[pointer-1]);
        }
        return re;
    }
}