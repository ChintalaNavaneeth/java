package arrays;

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

import java.util.Arrays;

public class fourteen {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int index[][] = {{0,1},{1,1}};

        oddCells(m,n,index);
    }
    public static void oddCells(int m, int n, int[][] indices) {
        int ans[][] = new int[m][n];
        Arrays.fill(ans,0);
        for (int x[]:indices) {
            for(int y : x)
            {

            }
        }

    }
}
