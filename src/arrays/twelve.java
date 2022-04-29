package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twelve {
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};
        System.out.println(        largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int ans[] = new int[gain.length +1];
        ans[0] = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            ans[i + 1] = ans[i] + gain[i];
            max = Math.max(ans[i + 1], max);
        }
        return max;
    }
}
