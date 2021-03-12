package com.maxqiu.demo.normal;

/**
 * 实现 strStr()
 * 
 * https://leetcode-cn.com/problems/implement-strstr/
 * 
 * @author Max_Qiu
 */
public class Issue0028 {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }

    public static int strStr(String haystack, String needle) {
        // 获取 needle 字符串长度
        int length = needle.length();
        // 循环比较
        for (int i = 0; i < haystack.length() - length + 1; i++) {
            if (haystack.substring(i, i + length).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
