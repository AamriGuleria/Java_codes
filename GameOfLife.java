public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] org=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                org[i][j]=board[i][j];
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                liveGame(board,i,j,org);
            }
        }
        display(board);
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void liveGame(int[][] board,int i,int j,int[][]org){
        int count=0;
        if(i-1>=0 && org[i-1][j]==1){
            count++;
        }
        if(i-1>=0 && j-1>=0 && org[i-1][j-1]==1){
            count++;
        }
        if(i-1>=0 && j+1<=org[0].length-1 && org[i-1][j+1]==1){
            count++;
        }
        if(j-1 >=0 && org[i][j-1]==1){
            count++;
        }
        if(j+1<=org[0].length-1 && org[i][j+1]==1){
            count++;
        }
        if(i+1<=board.length-1 && org[i+1][j]==1){
            count++;
        }
        if(i+1<=org.length-1 && j-1>=0 && org[i+1][j-1]==1){
            count++;
        }
        if(i+1<=org.length-1 && j+1<=board[0].length-1 && org[i+1][j+1]==1){
            count++;
        }
        if(org[i][j]==0 && count==3){
            board[i][j]=1;
        }
        else{
            if(count<2 || count>3){
                board[i][j]=0;
            }
        }
    }
}
