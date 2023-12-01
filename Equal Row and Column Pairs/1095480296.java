class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0 ; i<n;i++){
            String k = "";
            for (int j = 0; j<m;j++){
                k = k+grid[i][j]+",";
            }
            map1.put(k,map1.getOrDefault(k,0)+1);
        }
        for (int i=0;i<m;i++){
            String k = "";
            for (int j = 0; j<n;j++){
                k = k+grid[j][i]+",";
            }
            map2.put(k,map2.getOrDefault(k,0)+1);
        }
        int re = 0;
        for (String s: map1.keySet()){
            if (map2.containsKey(s)){
                re = re + map1.get(s)*map2.get(s);
            }
        }
        return re;
    }
}