class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ra = new HashMap<>();
        for (Character c:ransomNote.toCharArray()){
            ra.put(c,ra.getOrDefault(c,0)+1);
        }

        HashMap<Character,Integer> ma = new HashMap<>();
        for (Character c:magazine.toCharArray()){
            ma.put(c,ma.getOrDefault(c,0)+1);
        }

        for (Character c:ra.keySet()){
            if (!ma.containsKey(c)) return false;
            if (ra.get(c)>ma.get(c)) return false;
        }
        return true;
    }
}