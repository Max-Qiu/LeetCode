package com.maxqiu.demo.interview;

/**
 * 面试题 01.09. 字符串轮转
 *
 * https://leetcode-cn.com/problems/string-rotation-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0109 {
    public static void main(String[] args) {
        System.out.println(isFlippedString("waterbottle", "erbottlewat"));
        System.out.println(isFlippedString("aa", "aba"));
        System.out.println(isFlippedString("asdascacacsa", ""));
    }

    public static boolean isFlippedString(String s1, String s2) {
        // 长度相同，且两个s1拼接够存在s2子串
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}
