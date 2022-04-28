package arrays;
import  java.util.*;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class nine {
    public static void main(String[] args) {
        int a[]= {0,1,2,3,4};
        int t[] = {0,1,2,2,1};
        System.out.println(Arrays.toString(        createTargetArray(a,t)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int ans[] = new int[nums.length];
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            x.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = x.get(i);
        }

        return ans;
    }
}
