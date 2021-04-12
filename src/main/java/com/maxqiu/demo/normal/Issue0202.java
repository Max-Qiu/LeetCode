package com.maxqiu.demo.normal;

import java.util.HashSet;

/**
 * 快乐数
 * 
 * https://leetcode-cn.com/problems/happy-number/
 * 
 * @author Max_Qiu
 */
public class Issue0202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            int temp = 0;
            while (n > 9) {
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            temp += n * n;
            n = temp;
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }
        return true;
    }
}
