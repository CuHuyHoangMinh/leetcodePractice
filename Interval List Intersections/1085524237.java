class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length;
        int m = secondList.length;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        while (c1<n && c2<m){
            if ( firstList[c1][0] <= secondList[c2][0] && secondList[c2][1] <= firstList[c1][1]) {
                a.add(secondList[c2][0]);
                b.add(secondList[c2][1]);
                // c2++;
            } else if ( secondList[c2][0] <= firstList[c1][0] && firstList[c1][1] <= secondList[c2][1] ){
                a.add(firstList[c1][0]);
                b.add(firstList[c1][1]);
                // c1++;
            } else if ( firstList[c1][0] <= secondList[c2][0] && secondList[c2][0] <= firstList[c1][1]) {
                a.add(secondList[c2][0]);
                b.add(firstList[c1][1]);
                // c2++;
            } else if ( secondList[c2][0] <= firstList[c1][0] && firstList[c1][0] <= secondList[c2][1] ){
                a.add(firstList[c1][0]);
                b.add(secondList[c2][1]);
                // c1++;
            }
            
            if (firstList[c1][1]<secondList[c2][1]){
                c1++;
            }
            else{
                c2++;
            }
                
        }
        int [][] re = new int[a.size()][2];
        for (int i = 0;i<a.size();i++){
            re[i][0] = a.get(i);
            re[i][1] = b.get(i);
        }
        return re;
        
    }
}