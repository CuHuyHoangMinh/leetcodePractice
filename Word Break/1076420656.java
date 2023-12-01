class Solution {
    HashSet<String> set ;
    HashSet<String> notSet ;

    public boolean wordBreak(String s, List<String> wordDict) {
        set= new HashSet<>(wordDict);
        notSet= new HashSet<>();
        if (set.contains(s)) return true;
        return check(s);
        
    }

    boolean check(String s){
        // if (index >= s.length) return true;
        if (s=="") return true;
        if (set.contains(s)) return true;
        if (notSet.contains(s)) return false;
        for (String si: set){
            if (s.startsWith(si)){
                // System.out.println(si+" "+s.substring(si.length()));
                if (check(s.substring(si.length()))) return true;
                else notSet.add(s);
            }
        }
        notSet.add(s);
        return false;
    }
}