class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<>();
        HashMap<Character, Integer> tracker = new HashMap<>();

        for (Character c: t.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
            tracker.put(c,0);
        }
        int l = 0;
        int r = 0;
        int count = 0;
        int n = s.length();
        char [] ch = s.toCharArray();
        int min = Integer.MAX_VALUE;
        int min_l = -1;
        int min_r = -1;
        // HashSet<Integer> test = new HashSet<>();
        while (r<n){
                                // System.out.println(l +" " + r +" " + count);

            if ( tracker.containsKey( ch[r] ) ){
                tracker.put(ch[r], tracker.get(ch[r])+1);
                if (tracker.get(ch[r]).equals(m.get(ch[r]))){
                    count ++;
                }
            }
            // if (!test.contains(count)){
            //     System.out.println(count + " "+ m.keySet().size());;
            //     test.add(count);
            // }
                

            if (count == m.keySet().size()){
                
                while (count == m.keySet().size()){
                    if (l>=n) break;

                    int dist = r - l + 1;
                    if (dist<min) {
                        min = dist;
                        min_l = l;
                        min_r = r;
                    }
                      
                    if (tracker.containsKey(ch[l])){
                        tracker.put(ch[l],tracker.get(ch[l])-1 );
                        if (tracker.get(ch[l])<m.get(ch[l] ) ) count --;

                    }
                    l++;
                }
            }
            r++;
        }


        if (min==Integer.MAX_VALUE) return "";
        StringBuilder re = new StringBuilder();
        for (int i = min_l; i<=min_r;i++){
            re.append(ch[i]);
        }
        return re.toString();

    }
}
// ADOBECODEBANC