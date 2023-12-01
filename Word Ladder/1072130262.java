class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;
        HashMap<String,Set<String>> map = new HashMap<>();
        
        wordList.add(beginWord);

        for (String s: wordList){
            map.put(s,new HashSet<String>());
        }
        for (String s:wordList){
            for (String is:wordList){
                if (!is.equals(s)){
                    if (comp(s,is))
                        map.get(s).add(is);
                }
            }
        }
        // for (String s: map.keySet()){
        //     if (s.equals("ito")){
        //         System.out.print(s + ": ");
        //         for (String is:map.get(s)){
        //             System.out.print(is+", ");
        //         }
        //         System.out.println();
        //     }
        // }

        HashMap<String,Integer> shortPath = new HashMap<String,Integer>();
        HashSet<String> visited = new HashSet<String>();
        // visisted.add(beginWord);
        String cur = beginWord;
        for (String s:map.keySet()){
            shortPath.put(s,Integer.MAX_VALUE);
        }
        HashSet<String> tempSet = new HashSet<String>();
        shortPath.put(beginWord,1);
        while (!visited.contains(endWord)){
            // System.out.println("dasdsa: "+cur);
            if (cur.equals("")) break;
            // System.out.println(shortPath.get(cur));
            for (String s: map.get(cur)){
                // System.out.println(s + " "+shortPath.get(s));

                if (shortPath.get(s)>shortPath.get(cur)+1){
                    shortPath.put(s,shortPath.get(cur)+1);
                    // System.out.println("x");
                    tempSet.add(s);

                }
            }
            String temp = "";
            int min = Integer.MAX_VALUE;
            for (String s:tempSet){
                if (!visited.contains(s)){
                    if (shortPath.get(s)<min){
                        min = shortPath.get(s);
                        temp = s;
                    }
                }
            }

            visited.add(cur);
            cur = temp;
        }

        return shortPath.get(endWord)==Integer.MAX_VALUE?0:shortPath.get(endWord);
    }

    public boolean comp(String st1, String st2){
        if (st1.length()!=st2.length()) return false;
        int count = 0;
        for (int i = 0;i<st1.length();i++){
            if (st1.charAt(i)!=st2.charAt(i)) 
                count++;
            if (count >1) return false;
        }
        if (count >1) return false;
        return true;
    }


}