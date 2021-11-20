package com.maxqiu.demo.normal;

/**
 * 680. 验证回文字符串 Ⅱ
 *
 * https://leetcode-cn.com/problems/valid-palindrome-ii/
 *
 * @author Max_Qiu
 */
public class Issue0680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
        System.out.println(validPalindrome("abbcddcba"));
        System.out.println(validPalindrome("abcddcbba"));
        System.out.println(validPalindrome(
            "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    public static boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] == chars[j]) {
                continue;
            }
            return validPalindrome(chars, i + 1, j) || validPalindrome(chars, i, j - 1);
        }
        return true;
    }

    public static boolean validPalindrome(char[] chars, int i, int j) {
        for (; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
