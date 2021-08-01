package com.maxqiu.demo.normal;

/**
 * 485. 最大连续 1 的个数
 *
 * https://leetcode-cn.com/problems/max-consecutive-ones/
 *
 * @author Max_Qiu
 */
public class Issue0485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 0, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1, 0}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        // 定义最大数，累计数
        int max = 0, count = 0;
        for (int num : nums) {
            // 如果是1
            if (num == 1) {
                // 累计+1
                count++;
            }
            // 如果是0
            else {
                // 最大数取当前累计和最大中的较大值
                max = Math.max(count, max);
                // 累计数重置
                count = 0;
            }
        }
        // 当前累计和最大中的较大值
        return Math.max(count, max);
    }
}
