package Dp;

import java.util.List;

public class Triangle {
    public static int helper(List<List<Integer>> triangle){
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int minvalue=java.lang.Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,triangle.get(i).get(j)+minvalue);
            }
        }
        return triangle.get(0).get(0);
    }
}
