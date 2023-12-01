class Solution {
    public int differenceOfSums(int n, int m) {
        int l = (n/m) * m;
        int sum2 = (m+l)*((l-m)/m+1)/2;
        int sum = (n+1)*n /2;
        int sum1 = sum - sum2;
        // System.out.println(sum1 + " " + sum2);
        return sum1-sum2;
        
    }
}