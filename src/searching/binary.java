package searching;

public class binary {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int target = 10;
        System.out.println(binarysearch(a,target));
    }
    public static boolean binarysearch(int a[] , int target)
    {
        int s = 0;
        int e = a.length-1;
        int m;

        while (s < e)
        {
            m = s + (e-s)/2;
            if (a[m] == target) return true;
            else if (target > a[m]) s = m+1;
            else e = m;
        }
        return false;
    }
}
