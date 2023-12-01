class Solution {
    public int countHomogenous(String s) {
        long count = 0;
        int pointer = 0;
        char [] a = s.toCharArray();
        int beg = 0;
        while (pointer<a.length){
            while (pointer < a.length-1 && a[pointer] == a[pointer +1]) pointer ++;
            long len = pointer - beg +1;
            count = (count + len*(len+1)/2) % 1000000007;
            pointer++;
            beg= pointer;
        }
        return Math.toIntExact(count);
        
    }
}