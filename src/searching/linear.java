package searching;

public class linear {
    public static void main(String[] args) {
        int a[] = {9,5,4,7,6,8,1,2};
        int target = 5;
        System.out.println(linearsearch(a,target));
    }
    public static boolean linearsearch(int []a,int target)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) return true;
        }
        return false;
    }
}
