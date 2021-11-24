package com.maxqiu.demo.normal;

import java.util.Arrays;

/**
 * 724. 寻找数组的中心下标
 *
 * https://leetcode-cn.com/problems/find-pivot-index/
 *
 * @author Max_Qiu
 */
public class Issue0724 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[] {1, 2, 3}));
        System.out.println(pivotIndex(new int[] {2, 1, -1}));
        System.out.println(pivotIndex(new int[] {-1, -1, -1, -1, -1, 0}));
    }

    public static int pivotIndex(int[] nums) {
        // 先计算总和
        int total = Arrays.stream(nums).sum();
        // 遍历求和
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            // 如果当前索引的值 + 前面所有元素的和的两倍 等于 总和
            // 即：总和减去当前索引值，然后除以2
            // 当前索引前和值 和 当前索引后的和值 相等
            if (temp * 2 + nums[i] == total) {
                // 返回当前索引
                return i;
            }
            temp += nums[i];
        }
        return -1;
    }
}
