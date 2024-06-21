import java.util.*;
public class SudokuValid {
    public static void main(String[] args) {
        String[][] board = 
        {{"5","3",".",".","7",".",".",".","."}
        ,{"6",".",".","1","9","5",".",".","."}
        ,{".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"}};
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i)) {
                System.out.println("False");
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!check(board, i, j)) {
                    System.out.println("False");
                }
            }
        }
        System.out.println("True");
    }
    public static boolean isValidRow(String[][] board, int row) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (!board[row][i].equals(".") && !set.add(board[row][i])) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isValidColumn(String[][] board, int col) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (!board[i][col].equals(".") && !set.add(board[i][col])) {
                return false;
            }
        }
        return true;
    }
    public static boolean check(String[][] board,int row,int col){
        HashSet<String> set=new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (!board[i][j].equals(".") && !set.add(board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
