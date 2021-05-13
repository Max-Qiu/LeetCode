package com.maxqiu.demo.normal;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 两个数组的交集 https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * 
 * @author Max_Qiu
 */
public class Issue0349 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2}))); // 2
        System.out.println(Arrays.toString(intersection(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4}))); // 9,4
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        HashSet<Integer> num1Set = new HashSet<>();
        HashSet<Integer> returnSet = new HashSet<>();
        for (int i : nums1) {
            num1Set.add(i);
        }
        for (int i : nums2) {
            if (num1Set.contains(i)) {
                returnSet.add(i);
            }
        }
        int[] num = new int[returnSet.size()];
        int index = 0;
        for (Integer integer : returnSet) {
            num[index] = integer;
            index++;
        }
        return num;
    }
}
