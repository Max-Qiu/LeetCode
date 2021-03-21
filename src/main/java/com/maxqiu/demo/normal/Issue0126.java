package com.maxqiu.demo.normal;

import java.util.HashSet;

/**
 * 只出现一次的数字
 * 
 * https://leetcode-cn.com/problems/single-number/
 * 
 * @author Max_Qiu
 */
public class Issue0126 {
    public static void main(String[] args) {
        System.out.println(singleNumber1(new int[] {2, 2, 1}));
        System.out.println(singleNumber1(new int[] {4, 1, 2, 1, 2}));
        System.out.println(singleNumber2(new int[] {2, 2, 1}));
        System.out.println(singleNumber2(new int[] {4, 1, 2, 1, 2}));
    }

    /**
     * 哈希表解法
     */
    public static int singleNumber1(int[] nums) {
        // set 存储值
        HashSet<Integer> set = new HashSet<>();
        // 遍历数组
        for (int num : nums) {
            // 如果set中存在该数字
            if (set.contains(num)) {
                // 移除
                set.remove(num);
            }
            // 如果不存在
            else {
                // 添加
                set.add(num);
            }
        }
        // 返回第一个
        return set.iterator().next();
    }

    /**
     * 异或运算<br>
     * 
     * 1. 异或运算基本规则：<br>
     * 0 ^ 0 = 0<br>
     * 0 ^ 1 = 1<br>
     * 1 ^ 0 = 1<br>
     * 1 ^ 1 = 0<br>
     * 
     * 2. 数字异或运算（将数字转成二进制）<br>
     * 3 ^ 3 = 11 ^ 11 = 00 = 0<br>
     * 3 ^ 2 = 11 ^ 10 = 01 = 1<br>
     * 1 ^ 3 = 01 ^ 11 = 10 = 2<br>
     * 3 ^ 2 ^ 3 = 11 ^ 10 ^ 11 = 11 = 2 即：<br>
     * a ^ a = 0<br>
     * a ^ b = c<br>
     * a ^ b ^ c = b<br>
     * 
     * 3. 题解：<br>
     * 既然每个数字都出现两次，那么这些数字异或后为0，最后剩下0与单独的一个数字进行异或，等于原数字
     */
    public static int singleNumber2(int[] nums) {
        // 最终值
        int a = 0;
        // 遍历数组
        for (int num : nums) {
            // 异或运算
            a ^= num;
        }
        // 返回第一个
        return a;
    }
}
