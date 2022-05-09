package searching.leetcode;

public class three {
    public static void main(String[] args) {
        boolean x[] = {false,false,false,true,true};
        int e=5;
        System.out.println(firstBadVersion(e,x));
    }
    public static int firstBadVersion(int n,boolean x[]) {
        int s = 0;
        int e = n-1;
        int m;

        while (s < e)
        {
            m = s + (e-s)/2;
            if (x[m] == true && x[m-1] == false) return m;
            else if (!x[m]) s = m+1;
            else e = m;
        }
        return 0;
    }
}
