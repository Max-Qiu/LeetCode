package com.maxqiu.demo.normal;

/**
 * 最大子序和
 * 
 * https://leetcode-cn.com/problems/maximum-subarray/
 * 
 * @author Max_Qiu
 */
public class Issue0053 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4})); // 6
        System.out.println(maxSubArray(new int[] {-2, -3, -4})); // -2
        System.out.println(maxSubArray(new int[] {-2, -3, 4})); // 4
        System.out.println(maxSubArray(new int[] {-2, 1})); // 1
    }

    /**
     * 动态规划
     */
    public static int maxSubArray(int[] nums) {
        // 取最大值为默认的第一个数
        int max = nums[0];
        // 从第二个数开始遍历
        for (int i = 1; i < nums.length; i++) {
            // 计算当前索引与前一个索引的和
            int temp = nums[i] + nums[i - 1];
            // 和大于当前数，则当前索引赋值为和
            if (temp > nums[i]) {
                nums[i] = temp;
            }
            // 否则和为当前值
            else {
                temp = nums[i];
            }
            // 若和大于最大值，则修改最大值
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
