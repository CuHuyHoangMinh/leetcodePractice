class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        for (int i = 1;i<triangle.size();i++){
            int m = triangle.get(i).size();
            for (int j = 0; j< m;j++){
                int l = j-1;
                int r = j;
                if (l<0) triangle.get(i).set(j,triangle.get(i).get(j) + triangle.get(i-1).get(r));
                else if (r>=triangle.get(i-1).size() ) triangle.get(i).set(j,triangle.get(i).get(j) + triangle.get(i-1).get(l));
                else triangle.get(i).set(j,Integer.min(triangle.get(i).get(j) + triangle.get(i-1).get(r), triangle.get(i).get(j) + triangle.get(i-1).get(l)));
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<triangle.get(triangle.size()-1).size();i++){
            if (min>triangle.get(triangle.size()-1).get(i)) min = triangle.get(triangle.size()-1).get(i);
        }
        return min;
    }
}