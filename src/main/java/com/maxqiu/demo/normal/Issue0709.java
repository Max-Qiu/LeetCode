package com.maxqiu.demo.normal;

/**
 * 709. 转换成小写字母
 *
 * https://leetcode-cn.com/problems/to-lower-case/
 *
 * @author Max_Qiu
 */
public class Issue0709 {
    public static void main(String[] args) {
        System.out.println(toLowerCase("AZaz"));
        System.out.println(toLowerCase("hello"));
        System.out.println(toLowerCase("Hello@[]"));
    }

    public static String toLowerCase(String s) {
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] >= 65 && bytes[i] <= 90) {
                bytes[i] |= 32;
            }
        }
        return new String(bytes);
    }
}
