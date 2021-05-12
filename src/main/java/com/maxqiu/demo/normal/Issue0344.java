package com.maxqiu.demo.normal;

/**
 * 反转字符串
 * 
 * https://leetcode-cn.com/problems/reverse-string/
 * 
 * @author Max_Qiu
 */
public class Issue0344 {
    public static void main(String[] args) {
        char[] chars = new char[] {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(chars);
    }

    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
