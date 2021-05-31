package com.maxqiu.demo.normal;

/**
 * 找不同
 * 
 * https://leetcode-cn.com/problems/find-the-difference/
 * 
 * @author Max_Qiu
 */
public class Issue0389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        int c = 0;
        // 遍历，转成char对应的数字并求和
        for (int i = 0; i < t.length(); i++) {
            c += t.charAt(i);
        }
        // 同理，减掉之后剩余多余的字符对应的数字
        for (int i = 0; i < s.length(); i++) {
            c -= s.charAt(i);
        }
        // 强转
        return (char)c;
    }
}
