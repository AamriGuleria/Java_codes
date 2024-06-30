package Dp;
public class MinFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {{17,82},{1,-44}};
        find(matrix);
        System.out.println(display(matrix[0]));
    }
    public static int display(int[]matrix){
        int ans=matrix[0];
        for(int i=0;i<matrix.length;i++){
            System.out.print(matrix[i]+" ");
            ans=java.lang.Math.min(ans,matrix[i]);
        }
        return ans;
    }
    public static void find(int[][] mat){
        for(int row=mat.length-2;row>=0;row--){
            for(int col=0;col<mat[0].length;col++){
                int val=mat[row][col];
                int min=mat[row+1][col];
                if(col-1>=0){
                    min=java.lang.Math.min(min,mat[row+1][col-1]);
                }
                if(col+1<=mat[0].length-1){
                    min=java.lang.Math.min(min,mat[row+1][col+1]);
                }
                mat[row][col]=val+min;
            }
        }
    }
}
