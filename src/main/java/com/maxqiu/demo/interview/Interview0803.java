package com.maxqiu.demo.interview;

/**
 * 面试题 08.03. 魔术索引
 *
 * https://leetcode-cn.com/problems/magic-index-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0803 {
    public static void main(String[] args) {
        System.out.println(findMagicIndex(new int[] {0, 2, 3, 4, 5}));
        System.out.println(findMagicIndex(new int[] {1, 1, 1}));
        System.out.println(findMagicIndex2(new int[] {0, 2, 3, 4, 5}));
        System.out.println(findMagicIndex2(new int[] {1, 1, 1}));
    }

    public static int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int findMagicIndex2(int[] nums) {
        return find(nums, 0, nums.length);
    }

    private static int find(int[] nums, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (right - left) / 2 + left;
        int leftAnswer = find(nums, left, mid - 1);
        if (leftAnswer != -1) {
            return leftAnswer;
        } else if (nums[mid] == mid) {
            return mid;
        } else {
            return find(nums, mid + 1, right);
        }
    }
}
