package Dp;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid={
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
    };
    int count=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1'){
                build(grid,i,j);
                count++;
            }
        }
    }
    }
    public static void build(char[][] grid,int i,int j){
        if(grid[i][j]!='1' || i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1 ) {
            return;
        }
        grid[i][j]='2';
        build(grid,i+1,j);
        build(grid,i,j+1);
        build(grid,i-1,j);
        build(grid,i,j-1);
    }
}
