class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean top = false;
        boolean left = false;
        for (int i = 0;i<n;i++){
            for (int j = 0 ;j<m;j++){
                if (matrix[i][j] == 0){
                    if (i == 0) top = true;
                    if (j == 0) left = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1;i<n;i++){
            if (matrix[i][0] == 0)
                for (int j = 0;j<m;j++) {
                    matrix[i][j] = 0;
                }
        }
        for (int i = 1;i<m;i++){
            if (matrix[0][i] == 0)
                for (int j = 0;j<n;j++) {
                    matrix[j][i] = 0;
                }
        }
        if (top){
            // System.out.println("t" + " "+m);
            for (int i = 0;i<m;i++) matrix[0][i] = 0;
        }
        if (left){
            // System.out.println("l" );
            for (int i = 0; i<n;i++) matrix[i][0] = 0;
        }
    }
}