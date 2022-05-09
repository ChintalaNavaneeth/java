package searching.leetcode;

public class fibo {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int t = 3;
        System.out.println(binarysearchrecursion(a,t,0,a.length-1));
    }

    public static boolean binarysearchrecursion(int a[], int target,int s,int e)
    {

        if (s>e) return false;
        int m = s +(e-s)/2;
        if (a[m] == target) return true;
        if (a[m] > target) return binarysearchrecursion(a,target,s,m-1);
        return   binarysearchrecursion(a,target,m+1,e);

    }
    public static int fibo(int n)
    {
        if(n < 2) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
