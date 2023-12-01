class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(beginWord);

        visited.add(beginWord);
        int changes = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int x = 0 ;x<size;x++)
            {
                String cur = queue.poll();
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
                        if (set.contains(temp) && !visited.contains(temp)){
                            queue.add(temp);
                            visited.add(cur);

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