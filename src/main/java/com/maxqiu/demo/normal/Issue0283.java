package com.maxqiu.demo.normal;

import java.util.Arrays;

/**
 * @author Max_Qiu
 */
public class Issue0283 {
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 0, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        // 用于标记有效数字的索引
        int index = 0;
        // 遍历
        for (int i = 0; i < nums.length; i++) {
            // 如果当前索引的数字不等于0
            if (nums[i] != 0) {
                // 那就将当前数字赋值到有效数字索引位置
                nums[index] = nums[i];
                // 有效数字索引位置+1
                index++;
            }
        }
        // 遍历结束，从有效数字索引后面均覆盖为0
        for (; index < nums.length; index++) {
            nums[index] = 0;
        }
    }
}
