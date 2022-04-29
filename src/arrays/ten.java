package arrays;
import java.util.*;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class ten {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyfv";
        System.out.println(        checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String str) {
        if (str.length() < 26) return false;

        HashSet<Character> ans = new HashSet<>();
        for(int i=0; i<str.length();i++)
        {
            ans.add(str.charAt(i));
        }
        if (ans.size() == 26) return true;

        return false;

    }
}
