// Last updated: 8/13/2026, 11:27:49 PM
1class Solution{
2    public boolean isValidSudoku(char[][] board){
3        boolean[][] rows=new boolean[9][9];
4        boolean[][] col=new boolean[9][9];
5        boolean[][] box=new boolean[9][9];
6        for(int i=0;i<9;i++){
7            for(int j=0;j<9;j++){
8                if(board[i][j]!='.'){
9                    int num=board[i][j]-'1'; 
10                    int boxindex=(i/3)*3+(j/3);
11                    if(rows[i][num] || col[j][num] || box[boxindex][num]){
12                        return false;
13                    }
14                    rows[i][num]=true;
15                    col[j][num]=true;
16                    box[boxindex][num]=true;
17                }
18            } 
19        }
20        return true;
21    }
22}