package searching.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class four {
    public static void main(String[] args) {
    int a[] = {0,0,3,4};
    int target = 0;
        System.out.println(Arrays.toString(twoSum(a,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) return new int[]{i+1,j+1};
            }
        }
        return new int[]{0,0};
    }
}
