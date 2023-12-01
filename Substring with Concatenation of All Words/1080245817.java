class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        for (String si: words){
            if (map.containsKey(si)) map.put(si,map.get(si)+1);
            else map.put(si,1);
        }
        HashMap<String,Integer> temp = new HashMap<>(map);
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int r = 0;
        int count = 0;
        int wordLen = words[0].length();
        int start = l;
        List<Integer> re = new ArrayList<>();
        while (l<s.length()){
            boolean check = false;
            for (String si:map.keySet()){
                if (map.get(si)>0){
                    if (s.startsWith(si,l)){
                        // System.out.println(si);
                        count++;
                        l= l + si.length();
                        map.put(si,map.get(si)-1);
                        check = true;
                    }
                }
            }
            if (!check){
                if (count == words.length) re.add(start);
                l = start+1;
                start = l;
                count = 0;
                map = new HashMap<>(temp);
            }   
        }
        // System.out.println(count);
        if (count == words.length) re.add(start);

        return re;
    }
}