class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int re = 0;
        for (int i: hours){
            if (i>= target) re ++;
        }
        return re;
        
    }
}