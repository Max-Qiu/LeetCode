package com.maxqiu.demo.interview;

/**
 * 面试题 16.05. 阶乘尾数
 *
 * https://leetcode-cn.com/problems/factorial-zeros-lcci/
 *
 * @author Max_Qiu
 */
public class Interview1605 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "   " + trailingZeroes(i));
        }
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
