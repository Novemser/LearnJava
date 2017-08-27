package test;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/5/16
 */
public class Solution {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(Character.getNumericValue('2'));
    }

//    public List<String> letterCombinations(String digits) {
//        LinkedList<String> ans = new LinkedList<>();
//        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        for (int i = 0; i < digits.length(); i++) {
//            int x = Character.getNumericValue(digits.charAt(i));
//        }
//    }

    public boolean isPalindrome(String s) {
        if (null == s || s.equals("") || s.length() == 1)
            return true;

        s = s.toLowerCase();
        char[] tmp = s.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (!Character.isLetterOrDigit(tmp[i]))
                tmp[i] = ' ';
        }
        s = new String(tmp).replace(" ", "").trim();
        int len = s.length();
        int i, j;
        if (len % 2 != 0) {
            i = len / 2 - 1;
            j = len / 2 + 1;
        } else {
            j = len / 2;
            i = j - 1;
        }

        while (i >= 0 && j < len) {
            if (s.charAt(i--) != s.charAt(j++))
                return false;
        }

        return true;
    }
}
