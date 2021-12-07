package com.maxqiu.demo.normal;

/**
 * 796. 旋转字符串
 *
 * https://leetcode-cn.com/problems/rotate-string/
 *
 * @author Max_Qiu
 */
public class Issue0796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        // 1. s 和 goal 长度相同
        // 2. 两个 s 拼接之后，goal 是其子串
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
