package com.maxqiu.demo.normal;

/**
 * 509. 斐波那契数
 *
 * https://leetcode-cn.com/problems/fibonacci-number/
 *
 * @author Max_Qiu
 */
public class Issue0509 {
    public static void main(String[] args) {
        System.out.println(fib(30));
        System.out.println(fib2(30));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        if (n < 2) {
            return n;
        }
        int count = 0, x = 0, y = 1;
        for (int i = 2; i <= n; i++) {
            count = x + y;
            x = y;
            y = count;
        }
        return count;
    }
}
