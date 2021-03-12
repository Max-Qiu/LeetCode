package com.maxqiu.demo.normal;

/**
 * 爬楼梯
 * 
 * https://leetcode-cn.com/problems/climbing-stairs/
 * 
 * @author Max_Qiu
 */
public class Issue0070 {
    public static void main(String[] args) {
        System.out.println(climbStairs(1)); // 1
        System.out.println(climbStairs(2)); // 2
        System.out.println(climbStairs(3)); // 3
        System.out.println(climbStairs(4)); // 5
        System.out.println(climbStairs(5)); // 8
        System.out.println(climbStairs(6)); // 13
        System.out.println(climbStairs(45)); // 1836311903

        System.out.println(climbStairs2(1)); // 1
        System.out.println(climbStairs2(2)); // 2
        System.out.println(climbStairs2(3)); // 3
        System.out.println(climbStairs2(4)); // 5
        System.out.println(climbStairs2(5)); // 8
        System.out.println(climbStairs2(6)); // 13
        System.out.println(climbStairs2(45)); // 1836311903
    }

    /**
     * 递归
     * 
     * 超时了。。。
     */
    public static int climbStairs(int n) {
        if (n - 1 == 0) {
            return 1;
        }
        if (n - 2 == 0) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * 动态规划
     */
    public static int climbStairs2(int n) {
        int count = 0, x = 0, y = 1;
        for (int i = 1; i <= n; i++) {
            count = x + y;
            x = y;
            y = count;
        }
        return count;
    }
}
