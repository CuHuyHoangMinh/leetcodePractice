class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        List<Integer> dist = new ArrayList<>();
        int sum = 0;
        for (int i = 0 ; i<n;i++){

            for (int j = 0;j<n;j++) {
                HashSet<Integer> set = new HashSet<>();
                if (i+j<n){
                    for (int k =0;k<=i && j+k<n;k++){
                    set.add(nums.get(j+k));
                    }    
                }
                
                // System.out.println(j +" "+i + " " + set.size());
                sum = sum + set.size()*set.size();

            }
        }
        return sum;
        
    }
}