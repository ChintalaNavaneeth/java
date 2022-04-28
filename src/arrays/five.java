package arrays;


import java.util.Arrays;

public class five {
    public static void main(String[] args) {
        int a[] = {2,5,1,3,4,7};
        int x = 3;
        System.out.println(Arrays.toString(shuffle(a,x)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int ans[] =new int[len];
        int j= 0;

        for (int i = 0; i < len / 2; i++) {
            ans[j] = nums[i];
            ans[j+1] = nums[n + i];
            j+=2;
        }
        return ans;
    }
}
