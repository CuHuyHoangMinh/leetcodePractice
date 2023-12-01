class Solution {
    int [] dp;
    public int candy(int[] r) {
        int n = r.length;
        int []left = new int[n];
        int [] right = new int [n];        
        int sum = 0;
        left [0] = 1;
        for (int i=1;i<n;i++){
            if (r[i]>r[i-1]) left[i] = left[i-1]+1;
            else left[i] = 1;
        }
        right[n-1] = 1;
        for (int i=n-2;i>=0;i--){
            if (r[i]>r[i+1]) right[i] = right[i+1]+1;
            else right[i] = 1;
        }
        for (int i = 0; i<n;i++){
            // System.out.println(left[i] + " "+ right[i]);
            sum = sum + Integer.max(left[i],right[i]);
        }
        
        return sum;

    }

    // public int getCandy(int x, int[] ratings){
    //     System.out.println(x);
    //     if (x<=0) return 0;
    //     if (x>=dp.length-1) return 0;
    //     if (dp[x]!=0) return dp[x];
    //     if (ratings[x]<ratings[x-1] && ratings[x]<ratings[x+1]) return 1;
    //     // int min = Integer.min(getCandy(x-1,ratings),getCandy(x+1,ratings))+1;
    //     int a = getCandy(x-1,ratings);
    //     int b = getCandy(x+1,ratings);
    //     int min = Integer.min(a,b)+1;
    //     dp[x] = min;
    //     return min;
    // }
}