class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for (int i  = 0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for (int j = 0;j<m;j++){
                if (board[i][j]!='.'){
                    if (set.contains(board[i][j])) return false;
                    else set.add(board[i][j]);
                }
            }
        }
        
        for (int i  = 0;i<m;i++){
            HashSet<Character> set = new HashSet<>();
            for (int j = 0;j<n;j++){
                if (board[j][i]!='.'){
                    if (set.contains(board[j][i])) return false;
                    else set.add(board[j][i]);
                }
            }
        }

        for (int i = 0;i<n;i+=3){
            for (int j = 0;j<m;j+=3){
                HashSet<Character> set = new HashSet<>();
                for (int x = 0;x<3;x++){
                    for (int y = 0;y<3;y++){
                        char temp = board[i+x][j+y];
                        if (temp!='.') {
                            if (set.contains(temp)) return false;
                            else set.add(temp);
                        }
                        
                    }
                }
            }
        }
        return true;
    }
}