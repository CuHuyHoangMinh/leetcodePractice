class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> tracker =  new HashSet<>();
        char [] ch = s.toCharArray();

        int p_l = 0;
        int p_r = 0;
        int count = 0;
        int max = 0;
        while (p_l<s.length() && p_r<s.length()){
            if (tracker.contains(ch[p_r])){
                while (tracker.contains(ch[p_r])){
                    tracker.remove(ch[p_l]);
                    p_l++;
                    count --;
                }
            }
            
            count++;
            if (count > max) max= count;
            tracker.add(ch[p_r]);
            
            p_r++;
        }

        return max;
        
    }
}