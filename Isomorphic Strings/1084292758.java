class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character,Character> m = new HashMap<>();
        HashMap<Character,Character> m2 = new HashMap<>();

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int n = s.length();
        for (int i=0;i<n;i++){
            if (m.containsKey(cs[i])){
                if (!m.get(cs[i]).equals(ct[i])) return false;
            }else{
                m.put(cs[i],ct[i]);
            }
            if (m2.containsKey(ct[i])){
                if (!m2.get(ct[i]).equals(cs[i])) return false;
            }else{
                m2.put(ct[i],cs[i]);
            }

        }
        return true;
    }
}