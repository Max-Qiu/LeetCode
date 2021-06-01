package com.maxqiu.demo.normal;

/**
 * 判断子序列
 * 
 * https://leetcode-cn.com/problems/is-subsequence/
 * 
 * @author Max_Qiu
 */
public class Issue0392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("aec", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        // s 的索引
        int index = 0;
        // 遍历 t 的字符
        for (int i = 0; i < t.length() && index < s.length(); i++) {
            // 如果与 s 的字符相同，则 s 的索引 +1
            if (t.charAt(i) == s.charAt(index)) {
                index++;
            }
        }
        // 如果 s 的索引和长度相同，则说明是子子序列
        return index == s.length();
    }
}
