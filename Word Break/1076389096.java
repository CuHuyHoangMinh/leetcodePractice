class Solution {
    HashSet<String> set ;
    HashSet<String> notSet;
    public boolean wordBreak(String s, List<String> wordDict) {
        set= new HashSet<>(wordDict);
        notSet= new HashSet<>();

        if (set.contains(s)) return true;
        

        return check(s);
        
    }

    boolean check(String s){
        if (set.contains(s)) return true;
        if (notSet.contains(s)) return false;
        for (int i = 1;i<s.length();i++){
            String sl = s.substring(0,i);
            String sr = s.substring(i,s.length());
            // System.out.println
            boolean left = check(sl);
            if (left) set.add(sl);
            else notSet.add(sl);
            boolean right = check(sr);
            if (right) set.add(sr);
            else notSet.add(sr);
            if (left && right) return true;
        }
        return false;
    }
}