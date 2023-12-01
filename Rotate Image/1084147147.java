class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for (int i = 0;i<matrix.length;i++){
            inv(matrix[i]);
        }
        return ;
    }
    void inv(int [] a){
        int s = 0;
        int e = a.length-1;
        while (s<e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }

    void transpose(int [][] a){
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i<n;i++){
            for (int j =i+1;j<m;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}