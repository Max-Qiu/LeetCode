package com.maxqiu.demo.interview;

/**
 * 面试题 01.05. 一次编辑
 *
 * https://leetcode-cn.com/problems/one-away-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0106 {
    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa")); // a2b1c5a3
        System.out.println(compressString("aaaaaabbccd")); // abbccd
        System.out.println(compressString("abbccd")); // abbccd
        System.out.println(compressString("aabbccdd")); // abbccd
    }

    public static String compressString(String s) {
        // 长度小于等于2，无需压缩，直接返回
        if (s.length() <= 2) {
            return s;
        }
        // 定义字符，初始值为第一个字符
        char temp = s.charAt(0);
        // 定义字符的数量，初始值为1
        int count = 1;
        // 定义最终字符
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            // 如果相同
            if (temp == s.charAt(i)) {
                // 数量+1
                count++;
            }
            // 如果不同
            else {
                // 拼接当前字符和数量
                builder.append(temp).append(count);
                // 并更新新的字符为当前字符，数量为1
                temp = s.charAt(i);
                count = 1;
            }
        }
        // 最后将未拼接的字符拼接上去
        builder.append(temp).append(count);
        // 判断新字符串的长度是否小于元字符串，并返回结果
        return builder.length() < s.length() ? builder.toString() : s;
    }
}
