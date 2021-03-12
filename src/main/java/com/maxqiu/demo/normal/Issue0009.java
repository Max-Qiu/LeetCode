package com.maxqiu.demo.normal;

/**
 * 回文数
 * 
 * https://leetcode-cn.com/problems/palindrome-number/
 * 
 * @author Max_Qiu
 */
public class Issue0009 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-101));

        System.out.println(isPalindrome2(121));
    }

    /**
     * 转换为String
     */
    public static boolean isPalindrome(int x) {
        // 负数肯定不是回文数
        if (x < 0) {
            return false;
        }
        // 转换为String
        String s = String.valueOf(x);
        // 转换为数组
        String[] split = s.split("");
        // 遍历前半部分（偶数刚好一半，奇数中间不需要比）
        for (int i = 0, j = split.length - 1; i < split.length / 2; i++, j--) {
            // 首位开始比较，如果不一样，则返回false，否则继续向中间靠拢
            if (!split[i].equals(split[j])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 不转换为String
     */
    public static boolean isPalindrome2(int x) {
        // 负数肯定不是回文数
        if (x < 0) {
            return false;
        }
        // 原始值
        int original = x;
        // 整数反转
        int i = 0;
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            if ((temp + i * 10) / 10 != i) {
                i = -1;
                break;
            }
            i = temp + i * 10;
        }
        return original == i;
    }
}
