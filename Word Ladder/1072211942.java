class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;
        HashSet<String> list = new HashSet<String>(wordList);

        Queue<String> bfs = new LinkedList<String>();
        HashSet<String> visited = new HashSet<String>();
        HashMap<String,Integer> shortPath = new HashMap<String,Integer>();
        for (String s:list){
            shortPath.put(s,Integer.MAX_VALUE);
        }
        bfs.add(beginWord);
        shortPath.put(beginWord,1);

        while(!bfs.isEmpty()){
            String cur = bfs.poll();
            if (cur.equals(endWord)){
                break;
            }
            visited.add(cur);
            int n = cur.length();
            for (int i=0;i<n;i++){
                char [] cList = cur.toCharArray();
                for (char c = 'a';c<='z';c++){
                    cList[i] = c;
                    String temp = new String(cList);
                    // System.out.println(temp);
                    if (list.contains(temp) && !visited.contains(temp)){
                        bfs.add(temp);
                        shortPath.put(temp,Integer.min(shortPath.get(temp),shortPath.get(cur)+1));
                    }
                }
            }
            // break;
        }

        return shortPath.get(endWord)==Integer.MAX_VALUE?0:shortPath.get(endWord);
    }


}