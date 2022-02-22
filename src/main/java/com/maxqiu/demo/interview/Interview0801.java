package com.maxqiu.demo.interview;

/**
 * 面试题 08.01. 三步问题
 *
 * https://leetcode-cn.com/problems/three-steps-problem-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0801 {
    public static void main(String[] args) {
        System.out.println(waysToStep(3));
        System.out.println(waysToStep(5));
        System.out.println(waysToStep(7));
        System.out.println(waysToStep(61));
        System.out.println(waysToStep(614));
    }

    public static int waysToStep(int n) {
        if (n <= 2) {
            return n;
        }
        if (n == 3) {
            return 4;
        }
        long count = 0, x = 1, y = 2, z = 4;
        for (int i = 4; i <= n; i++) {
            count = (((x + y) % 1000000007) + z) % 1000000007;
            x = y;
            y = z;
            z = count;
        }
        return (int)count;
    }
}
