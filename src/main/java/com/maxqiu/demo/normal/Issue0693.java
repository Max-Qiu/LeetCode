package com.maxqiu.demo.normal;

/**
 * 693. 交替位二进制数 https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 *
 * @author Max_Qiu
 */
public class Issue0693 {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(10));
        System.out.println(hasAlternatingBits(1431655766));
    }

    public static boolean hasAlternatingBits(int n) {
        long i = 1;
        boolean flag = true;
        while (i < n) {
            if (flag) {
                i = i * 2;
                flag = false;
            } else {
                i = i * 2 + 1;
                flag = true;
            }
        }
        return i == n;
    }
}
