class Solution {
    public int trap(int[] r) {
        int n = r.length;
        int max = 0;
        int sum = 0;
        int [] left = new int[n];
        int [] right = new int[n];
        for (int i=0;i<n;i++){
            if (r[i]>max){
                max = r[i];
                // temp = i;
                left[i] = 0;
            } else{
                left[i] = max- r[i];
                // sum = sum + max-r[i];
            }
        }
        max = 0;
        for (int i=n-1;i>=0;i--){
            if (r[i]>max){
                max = r[i];
                right[i] = 0;
            }
            else{
                right[i] = max-r[i];
            }
        }
        for (int i = 0;i<n;i++){
            // System.out.println(left[i] + " " + right[i]);
            sum = sum + Integer.min(left[i],right[i]);
        }
        
        return sum;
        
    }
}