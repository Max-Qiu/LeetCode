package com.maxqiu.demo.normal;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 *
 * https://leetcode-cn.com/problems/two-sum
 *
 * @author Max_Qiu
 */
public class Issue0001 {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    /**
     * T：O(N^2)
     *
     * S：O(1)
     */
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    /**
     * T：O(N)
     *
     * S：O(N)
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] {i, hashMap.get(target - nums[i])};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}