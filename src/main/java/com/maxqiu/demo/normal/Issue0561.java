package com.maxqiu.demo.normal;

import java.util.Arrays;

/**
 * 561. 数组拆分 I
 *
 * https://leetcode-cn.com/problems/array-partition-i/
 *
 * @author Max_Qiu
 */
public class Issue0561 {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[] {1, 4, 3, 2}));
        System.out.println(arrayPairSum(new int[] {6, 2, 6, 5, 1, 2}));
    }

    public static int arrayPairSum(int[] nums) {
        // 排序
        Arrays.sort(nums);
        int count = 0;
        // 遍历，每两位取前一位
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        return count;
    }
}
