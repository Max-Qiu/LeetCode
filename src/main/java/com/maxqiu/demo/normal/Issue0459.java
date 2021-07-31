package com.maxqiu.demo.normal;

/**
 * 459. 重复的子字符串
 *
 * https://leetcode-cn.com/problems/repeated-substring-pattern/
 *
 * @author Max_Qiu
 */
public class Issue0459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("aba"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
        System.out.println(repeatedSubstringPattern("abac"));
        System.out.println(repeatedSubstringPattern("aabaaba"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        // length：子字符串的长度
        for (int length = 1; length <= s.length() / 2; length++) {
            // 获取第一个子字符串
            String firstChar = s.substring(0, length);
            // nextIndex：下一个子字符串索引
            int nextIndex = length;
            // allIsSame：是否每一个子字符串都匹配
            boolean allIsSame = false;
            while (nextIndex <= s.length() - length) {
                // 取出下一个子字符串，并判断是否和第一个子字符串相同
                String nextChar = s.substring(nextIndex, nextIndex + length);
                if (nextChar.equals(firstChar)) {
                    allIsSame = true;
                } else {
                    // 如果子字符串不相同，则跳过后续的匹配
                    allIsSame = false;
                    break;
                }
                nextIndex = nextIndex + length;
            }
            // 若所有子字符串均相同且索引刚好在最后（没有多余的字符）
            if (allIsSame && nextIndex == s.length()) {
                return true;
            }
        }
        return false;
    }
}
