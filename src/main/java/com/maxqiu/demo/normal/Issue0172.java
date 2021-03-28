package com.maxqiu.demo.normal;

/**
 * 阶乘后的零
 * 
 * https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 * 
 * @author Max_Qiu
 */
public class Issue0172 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "   " + trailingZeroes(i));
        }
    }

    public static long trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
