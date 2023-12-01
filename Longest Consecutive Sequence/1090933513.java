class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int i:nums){
            if (map.containsKey(i)) continue;
            if ( (map.containsKey(i-1) && map.containsKey(i+1)) ){
                map.put(i,1+map.get(i-1)+map.get(i+1));
                map.put(i-map.get(i-1),map.get(i));
                map.put(i+map.get(i+1),map.get(i));
            } else if (map.containsKey(i-1)){
                map.put(i,map.get(i-1)+1);
                map.put(i-map.get(i-1),map.get(i));
            } else if (map.containsKey(i+1)){
                map.put(i,map.get(i+1)+1);
                map.put(i+map.get(i+1),map.get(i));
            } else{
                map.put(i,1);
            }
            if (max< map.get(i)) max = map.get(i);
        }
        return max; 
        
    }
}