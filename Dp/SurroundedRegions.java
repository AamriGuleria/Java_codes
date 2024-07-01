package Dp;

public class SurroundedRegions {
    public static void main(String[] args) {
        char[][] board={
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'};
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O'){
                check(board,0,i);
            }
            if(board[board.length-1][i]=='O'){
                check(board,board.length-1,i);
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
                check(board,i,0);
            }
            if(board[i][board[0].length-1]=='O'){
                check(board,i,board[0].length-1);
            }
        }
        for(int i=0;i<=board.length-1;i++){
            for(int j=0;j<=board[0].length-1;j++){
                if(board[i][j]=='*'){
                    board[i][j]='O';
                }
                else if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    public static void check(char[][] board,int i,int j){
        if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1 || board[i][j]!='O' ){
            return;
        }
        board[i][j]='*';
        check(board,i+1,j);
        check(board,i-1,j);
        check(board,i,j+1);
        check(board,i,j-1);
    }
}
