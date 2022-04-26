package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class three {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(a)));
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int ans[] =new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]  = sum + nums[i];
            sum += nums[i];
        }
        return ans;
    }
}
