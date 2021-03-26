package com.maxqiu.demo.normal;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和 II - 输入有序数组
 * 
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * 此题解法同 Issue0001
 * 
 * @author Max_Qiu
 */
public class Issue0167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9))); // [1,2]
        System.out.println(Arrays.toString(twoSum2(new int[] {2, 7, 11, 15}, 9))); // [1,2]
        System.out.println(Arrays.toString(twoSum(new int[] {2, 3, 4}, 6))); // [1,3]
        System.out.println(Arrays.toString(twoSum2(new int[] {2, 3, 4}, 6))); // [1,3]
        System.out.println(Arrays.toString(twoSum(new int[] {-1, 0}, -1))); // [1,2]
        System.out.println(Arrays.toString(twoSum2(new int[] {-1, 0}, -1))); // [1,2]
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] {hashMap.get(target - nums[i]) + 1, i + 1};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
