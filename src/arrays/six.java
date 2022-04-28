package arrays;
import java.util.*;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class six {
    public static void main(String[] args) {
        int a[] = {2,3,5,1,3};
        int ec =3 ;
        System.out.println(kidsWithCandies(a,ec));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int max = 0;
      for(int x:candies) max = Math.max(max,x);
      List<Boolean> ans = new ArrayList<>();
      for (int x:candies)
      {
          if (x + extraCandies >= max) ans.add(true);
          else ans.add(false);
      }
        return ans;
    }
}
