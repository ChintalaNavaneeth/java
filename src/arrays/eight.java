package arrays;
import  java.util.*;


//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class eight {
    public static void main(String[] args) {
        int a[] = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(a)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int copy[] = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);

        int ans[] =  new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == copy[j])
                {
                    ans[i] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
