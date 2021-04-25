package com.maxqiu.demo.normal;

/**
 * 2的幂
 * 
 * https://leetcode-cn.com/problems/power-of-two/
 * 
 * @author Max_Qiu
 */
public class Issue0231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(218));
    }

    public static boolean isPowerOfTwo(int n) {
        // 如果 n 等于 0，直接返回false
        if (n == 0) {
            return false;
        }
        // 当 n 取余 2 等于 0 时，说明是 2 的倍数
        while (n % 2 == 0) {
            // 缩小
            n = n / 2;
        }
        // 缩小至最后，若是1，即 2/2=1，说明是2的倍数，否则不是
        return n == 1;
    }
}
