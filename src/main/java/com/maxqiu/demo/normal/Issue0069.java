package com.maxqiu.demo.normal;

/**
 * x 的平方根
 * 
 * https://leetcode-cn.com/problems/sqrtx/
 * 
 * @author Max_Qiu
 */
public class Issue0069 {

    public static void main(String[] args) {
        System.out.println(mySqrt(4)); // 2
        System.out.println(mySqrt(8)); // 2
        System.out.println(mySqrt(2147395600)); // 2
    }

    public static int mySqrt(int x) {
        int i = 0;
        while ((long)i * i <= x) {
            i++;
        }
        return i - 1;
    }

}
