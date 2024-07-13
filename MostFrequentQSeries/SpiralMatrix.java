package MostFrequentQSeries;

import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        
    }
    public static void spiral(int[][] mat,int i,int j,List<Integer> ans){
        if(i>mat.length-1 || j>mat[0].length-1){
            return;
        }
        //for the row from left to right
        for(int k=j;k<=mat[0].length-j-1;k++){
            ans.add(mat[i][k]);
        }
        //from top to bottom
        for(int k=i+1;k<=mat.length-i-1;k++){
            ans.add(mat[k][mat[0].length-j-1]);
        }
        //right to left
        for(int k=mat[0].length-j-2;k>=j;k--){
            ans.add(mat[mat.length-i-1][k]);
        }
        // //bottom to top
        for(int k=mat.length-i-2;k>i;k--){
            ans.add(mat[k][j]);
        }
        spiral(mat,i+1,j+1,ans);
    }
}
