package arrays;

//https://leetcode.com/problems/richest-customer-wealth/
public class four {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(a));

    }
    public static int maximumWealth(int[][] accounts) {

        int m = 0, sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int x:accounts[i]) {
                sum += x;
            }
            if (sum > m) m = sum;
            sum = 0;
        }
        return m;
    }
}
