package MostFrequentQSeries;

public class WordSearch {
    public static boolean check2(char[][] board, String word,int i,int j,boolean[][] visited){
        if(word.length()==0){
            return true;
        }
        if(i>board.length-1 || i<0 || j>board[0].length-1 || j<0){
            return false;
        }
        if (board[i][j] != word.charAt(0) || visited[i][j]) {
        return false;  
    }
    visited[i][j] = true;
        boolean found = check2(board, word.substring(1), i + 1, j, visited)
                    || check2(board, word.substring(1), i - 1, j, visited)
                    || check2(board, word.substring(1), i, j + 1, visited)
                    || check2(board, word.substring(1), i, j - 1, visited);

    visited[i][j] = false;

    return found;
    }
    public static boolean check(char[][] board, String word,int i,int j){
        if(word.length()==0){
            return true;
        }
        if(i>board.length-1 || i<0 || j>board[0].length-1 || j<0){
            return false;
        }
        
        if(word.charAt(0)==board[i][j]){
           return  check(board,word.substring(1),i+1,j)||check(board,word.substring(1),i,j+1);
        }
        else{
            return false;
        }
    }
}
