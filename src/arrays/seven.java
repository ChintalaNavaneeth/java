package arrays;
//https://leetcode.com/problems/number-of-good-pairs/
public class seven {
    public static void main(String[] args) {
    int a[] = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(a));
    }
    public static int numIdenticalPairs(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) c++;
            }
        }
        return c;
    }
}
