package com.maxqiu.demo.normal;

/**
 * 643. 子数组最大平均数 I
 *
 * https://leetcode-cn.com/problems/maximum-average-subarray-i/
 *
 * @author Max_Qiu
 */
public class Issue0643 {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {1, 12, -5, -6, 50, 3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += nums[i];
        }
        double avg = count / (double)k;
        for (int i = k, j = 0; i < nums.length; i++, j++) {
            count = count - nums[j] + nums[i];
            avg = Math.max(avg, count / (double)k);
        }
        return avg;
    }
}
