package searching;

public class linear {
    public static void main(String[] args) {
        int a[]= {15,35,74,95,85,26,84,26,96,4,8,56,9};
        int target = 35;
        System.out.println(linearsearch(a,target));

        String str = "manchester";
        char strtar= 'h';
        System.out.println(linearinstring(str,strtar));

        System.out.println(counteven(a));
    }
    public static int counteven(int []arr)
    {
        int c = 0;
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (((int)Math.log10(arr[i])+1) % 2 == 0 ) c++;
        }
        return c;
    }

    public static boolean linearinstring(String str,char t)
    {
        for (int i = 0; i < str.length(); i++) {
            if (t == str.charAt(i)) return true;
        }
        return false;
    }
    public static boolean linearsearch(int a[],int t)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t )return true;
        }
        return false;   
    }
}
