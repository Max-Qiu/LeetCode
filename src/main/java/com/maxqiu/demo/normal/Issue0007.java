package com.maxqiu.demo.normal;

/**
 * 整数反转
 * 
 * https://leetcode-cn.com/problems/reverse-integer/
 * 
 * @author Max_Qiu
 */
public class Issue0007 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(123));
        System.out.println(reverse(-321));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
        System.out.println(reverse(10));
        System.out.println(reverse(1212121212));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        int i = 0;
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            if ((temp + i * 10) / 10 != i) {
                return 0;
            }
            i = temp + i * 10;
        }
        return i;
    }
}
