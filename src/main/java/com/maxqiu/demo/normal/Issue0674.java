package com.maxqiu.demo.normal;

/**
 * 674. 最长连续递增序列
 *
 * https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 *
 * @author Max_Qiu
 */
public class Issue0674 {
    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[] {1, 3, 5, 4, 7}));
        System.out.println(findLengthOfLCIS(new int[] {2, 2, 2, 2, 2}));
        System.out.println(findLengthOfLCIS(new int[] {1, 3, 5, 7}));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int max = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
