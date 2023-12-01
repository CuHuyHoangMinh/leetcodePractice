class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> list = new HashSet<String>(wordList);
        if (!list.contains(endWord)) return 0;

        Queue<String> bfs = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        // HashMap<String,Integer> shortPath = new HashMap<String,Integer>();
        // for (String s:list){
        //     shortPath.put(s,Integer.MAX_VALUE);
        // }
        bfs.add(beginWord);
        // shortPath.put(beginWord,1);
        visited.add(beginWord);
        int changes = 1;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            for (int x = 0 ;x<size;x++)
            {
                String cur = bfs.poll();
                visited.add(cur);

                if (cur.equals(endWord)){
                    return changes;
                }
                int n = cur.length();
                for (int i=0;i<n;i++){
                    char [] cList = cur.toCharArray();
                    for (char c = 'a';c<='z';c++){
                        cList[i] = c;
                        String temp = new String(cList);
                        // System.out.println(temp);
                        if (list.contains(temp) && !visited.contains(temp)){
                            bfs.add(temp);
                            // shortPath.put(temp,Integer.min(shortPath.get(temp),shortPath.get(cur)+1));

                        }
                    }
                }
            }
            changes++;
            
            // break;
        }

        return 0;
    }


}