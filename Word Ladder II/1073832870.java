class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        
        HashSet<String> dict = new HashSet<String>(wordList);
        if (!dict.contains(endWord)) return new ArrayList<>();
        dict.add(beginWord);
        System.out.println(dict.size());
        List<List<String>> re = new ArrayList<>();
        HashMap<String,HashSet<String>> map = new HashMap<>();

        for (String s: dict){
            map.put(s, new HashSet<>());
        }
        
        for (String s1: dict){
            for (String s2: dict){
                if (!s1.equals(s2)){
                    if (comp(s1,s2))
                        map.get(s1).add(s2);
                }
            }
        }

        Queue<String> bfs = new LinkedList<String>();
        HashSet<String> visited = new HashSet<String>();
        HashMap<String,Integer> shortPath = new HashMap<>();
        HashMap<String,HashSet<String>> tracer = new HashMap<>();

        for (String s: dict){
            shortPath.put(s,Integer.MAX_VALUE);
            tracer.put(s,new HashSet<>());
        }

        shortPath.put(beginWord,1);
        
        bfs.add(beginWord);
        // int size = 1;
        while (!bfs.isEmpty()){
            String cur = bfs.poll();
            // System.out.println(cur);
            // System.out.println(visited.size());
            if (!visited.contains(cur)){
                visited.add(cur);
                if (cur.equals(endWord)) break;
                    for (String s: map.get(cur)){
                        if (!visited.contains(s)){
                            bfs.add(s);
                            int min = shortPath.get(s);
                            if (shortPath.get(cur)+1<=min){
                                min = shortPath.get(cur)+1;
                                shortPath.put(s,min);
                                tracer.get(s).add(cur);
                            }
                        }
                    }
            }
            
        }

        List<String> temp = new ArrayList<String>();
        // System.out.println(shortPath.get(endWord));
        gen(tracer,re,temp,beginWord,endWord);
        return re;
    }

    public boolean comp(String s1, String s2){
        if (s1.length()!=s2.length()) return false;
        int n = s1.length(); 
        int count =0;
        for (int i = 0;i<n;i++){
            if (s1.charAt(i)!=s2.charAt(i))
                count++;
            if (count>1) return false;
        }
        return true;

    }

    public void gen(HashMap<String,HashSet<String>> tracer,List<List<String>> re, List<String> temp, String beginWord, String cur){
        temp.add(cur);
        // System.out.print(cur+" ");
        for (String s: tracer.get(cur)){
            gen(tracer,re,temp,beginWord,s);
        }
        if (cur.equals(beginWord)){
            List<String> t = new ArrayList<>(temp);
            Collections.reverse(t);
            re.add(t);
            // System.out.println();
        }
        temp.remove(cur);
        
    }   
}