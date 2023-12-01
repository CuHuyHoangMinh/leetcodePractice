class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> re = new ArrayList<>();
        HashMap<String,List<String>> m = new HashMap<>();
        for (String s: strs){
            char [] ca = s.toCharArray();
            Arrays.sort(ca);
            String k = new String(ca);
            if (m.containsKey(k)){
                m.get(k).add(s);
            } else{
                m.put(k,new ArrayList<>());
                m.get(k).add(s);
            }
        }
        for (String s: m.keySet()){
            ArrayList<String> temp = new ArrayList<>();

            for (String si:m.get(s)){
                temp.add(si);
            }
            re.add(temp);
        }

        return re;
        
    }
}