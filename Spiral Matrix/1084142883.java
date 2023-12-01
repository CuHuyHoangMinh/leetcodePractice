class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean [][] check = new boolean[n][m];
        // Arrays.fill(check,false);
        ArrayList<Integer> re = new ArrayList<>();
        move(re,0,matrix,check,0,0,n*m);
        System.gc();
        return re;
        
    }

    void move(List<Integer> re, int dir, int[][] matrix, boolean[][] check, int x, int y,int total){
        if (re.size() == total ) return;
        if (x>= matrix.length) return;
        if (y>= matrix[0].length) return;
        if (check[x][y]) return;
        // System.out.println(x+" "+ y + " "+ dir);
        re.add(matrix[x][y]);
        check[x][y] = true;
        if (dir == 0){
            if ( y+1<matrix[0].length && !check[x][y+1]){
                move(re,dir,matrix,check,x,y+1, total);
            } else{
                move(re,1,matrix,check,x+1,y,total);
            }
        } else if (dir == 1){
            if (x+1<matrix.length && !check[x+1][y])
                move(re,dir,matrix,check,x+1,y,total);
            else
                move(re,2,matrix,check,x,y-1,total);
        } else if (dir == 2) {
            if ( y-1 >=0 && !check[x][y-1])
                move(re,dir,matrix,check,x,y-1,total);
            else 
                move(re,3,matrix,check,x-1,y,total);
        } else if (dir == 3){
            if (x-1>=0 && !check[x-1][y])
                move(re,dir,matrix,check,x-1,y,total);
            else
                move(re,0,matrix,check,x,y+1,total);
        }
        return;
    }
}