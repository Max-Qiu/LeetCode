package com.maxqiu.demo.normal;

/**
 * 最后一个单词的长度
 * 
 * https://leetcode-cn.com/problems/length-of-last-word/
 * 
 * @author Max_Qiu
 */
public class Issue0058 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World")); // 5
        System.out.println(lengthOfLastWord(" ")); // 0
        System.out.println(lengthOfLastWord("World")); // 5
        System.out.println(lengthOfLastWord("a ")); // 1
    }

    public static int lengthOfLastWord(String s) {
        // 去除左右空格
        s = s.trim();
        // 获取字符串长度
        int strLength = s.length();
        // 获取最后一个空格的长度
        int lastIndexOf = s.lastIndexOf(" ");
        // 如果找不到最后一个空格
        if (lastIndexOf == -1) {
            // 则返回当前字符串长度
            return strLength;
        }
        return strLength - lastIndexOf - 1;
    }
}
