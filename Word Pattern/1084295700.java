class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> m = new HashMap<>();
        HashMap<String,Character> m2 = new HashMap<>();

        String[] a = s.split("\\s+");
        char [] c = pattern.toCharArray();
        int n = pattern.length();
        if (n!=a.length) return false;
        for (int i=0;i<n;i++){
            if (m.containsKey(c[i])){
                if (!m.get(c[i]).equals(a[i])) return false;
            } else{
                m.put(c[i],a[i]);
            }

            if (m2.containsKey(a[i])){
                if (!m2.get(a[i]).equals(c[i])) return false;
            } else{
                m2.put(a[i],c[i]);
            }
        }        
        return true;
    }
}