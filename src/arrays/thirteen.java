package arrays;

import java.util.Arrays;


//https://leetcode.com/problems/flipping-an-image/

public class thirteen {
    public static void main(String[] args) {
    int [][]  image = {{1,1,0},{1,0,1},{0,0,0}};
        int ans[][] = flipAndInvertImage(image);
        for (int []x:ans) {
            System.out.println(Arrays.toString(x));
        }
    }
    public static int[][] flipAndInvertImage(int[][] A) {
        int x = A[0].length;
        for (int i[] : A) {
            for (int j = 0; j < x; j++) {
                i[j] = (i[j] == 0)? 1:0;
            }
        }
        return A;
    }

}
