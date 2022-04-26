package arrays;

//https://leetcode.com/problems/build-array-from-permutation/
import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        int [] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];

        for (int i = 0; i < ans.length ; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;

    }
}

