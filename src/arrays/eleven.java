package arrays;
import  java.util.*;


//https://leetcode.com/problems/count-items-matching-a-rule/

public class eleven {
    public static void main(String[] args) {
        List<List<String>> main =new ArrayList<>();
        List<String> s1 = Arrays.asList("phone","blue","pixel");
        List<String> s2 = Arrays.asList("computer","silver","lenovo");
        List<String> s3 = Arrays.asList("phone","gold","iphone");

        main.add(s1);
        main.add(s2);
        main.add(s3);

        System.out.println(countMatches(main,"color","silver"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0, ind;
        if(ruleKey.equals("type"))
            ind = 0;
        else if(ruleKey.equals("color"))
            ind = 1;
        else
            ind = 2;
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).get(ind).equals(ruleValue))
                res++;
        }
        return res;
    }
}
