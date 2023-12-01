class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL=0;
        int countR=0;
        int count = 0;
        int n = moves.length();
        for (int i = 0;i<n;i++){
            if (moves.charAt(i)=='L') countL++;
            if (moves.charAt(i)=='R') countR++;
            if (moves.charAt(i)=='_') count++;
        }
        if (countL==countR) return count;
        if (countL>countR) return countL+count-countR;
        return countR+count-countL;
        
    }
}