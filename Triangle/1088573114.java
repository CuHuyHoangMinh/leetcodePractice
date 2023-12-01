class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(triangle.get(0).get(0));
        dp.add(first);
        for (int i = 1;i<triangle.size();i++){
            int m = triangle.get(i).size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j< m;j++){
                int l = j-1;
                int r = j;
                if (l<0) temp.add(triangle.get(i).get(j) + dp.get(i-1).get(r));
                else if (r>=triangle.get(i-1).size() ) temp.add(triangle.get(i).get(j) + dp.get(i-1).get(l));
                else temp.add(Integer.min(triangle.get(i).get(j) + dp.get(i-1).get(r), triangle.get(i).get(j) + dp.get(i-1).get(l)));
            }
            dp.add(temp);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<dp.get(dp.size()-1).size();i++){
            if (min>dp.get(dp.size()-1).get(i)) min = dp.get(dp.size()-1).get(i);
        }
        return min;
    }
}