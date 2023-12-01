class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long count1 = 0;
        long count2 = 0;
        long sum1 = 0;
        long sum2 = 0;
        for (int i: nums1){
            sum1 = sum1+i;
            if (i == 0 ) count1++;
        }
        for (int i: nums2){
            sum2 = sum2+i;
            if (i == 0 ) count2++;
        }
        if (count1 == 0 && count2 == 0 ){
            if (sum1 == sum2) return sum1;
            else return -1;
        }
        // System.out.println(sum1 + " "+ sum2 + " "+ count1+ " "+ count2);
        if (sum1 > sum2 && count2 == 0 ) return -1;
        if (sum1 < sum2 && count1 == 0 ) return -1;
        if (sum1 + count1 > sum2 && count2 == 0 ) return -1;
        if (sum1 < sum2 + count2 && count1 == 0 ) return -1;
        return Long.max(sum1+count1,sum2+count2);
        
    }
}