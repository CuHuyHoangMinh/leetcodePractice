class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        PriorityQueue<Data> q = new PriorityQueue<>();

        int cur_x = n-1;
        int cur_y = n-1;
        q.add(new Data(grid[cur_x][cur_y],cur_x,cur_y));
        int max = grid[cur_x][cur_y];
        boolean [][] marker = new boolean[n][n];
        // marker[n-1][n-1]= true;

        while (cur_x!=0 || cur_y!=0){
            Data temp = q.poll();
            cur_x = temp.x;
            cur_y = temp.y;
            marker[cur_x][cur_y] = true;
            // System.out.println(cur_x+" "+cur_y + " "+temp.val);
            if (temp.val > max) max = temp.val;
            if (cur_x>0 && !marker[cur_x-1][cur_y])
            {
                int x = cur_x -1;
                int y = cur_y;
                q.add(new Data(grid[x][y],x,y));
            }
            if (cur_y>0 && !marker[cur_x][cur_y-1]){
                int x = cur_x;
                int y= cur_y - 1;
                q.add(new Data(grid[x][y],x,y));
            }
            if (cur_x+1<n && !marker[cur_x+1][cur_y]){
                int x = cur_x + 1;
                int y = cur_y;
                q.add(new Data(grid[x][y],x,y));
            }
            if (cur_y+1<n && !marker[cur_x][cur_y+1]){
                int x = cur_x;
                int y = cur_y + 1;
                q.add(new Data(grid[x][y],x,y));
            }
            // for (Data d: q){
            //     System.out.println(d);
            // }
            // System.out.println("******");
                
        }

        return max;     
    }
}

class Data implements Comparable<Data>{
    int val;
    int x;
    int y;
    public Data(int val, int x, int y){
        this.val = val;
        this.x = x;
        this.y = y;
    }
        @Override
    	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		return Integer.compare(val,o.val);
        }

        @Override
        public String toString(){
            return x+" "+y+": "+val;
        }
	
}