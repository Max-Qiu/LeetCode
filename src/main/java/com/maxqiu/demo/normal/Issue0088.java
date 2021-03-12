package com.maxqiu.demo.normal;

import java.util.Arrays;

/**
 * 合并两个有序数组
 * 
 * https://leetcode-cn.com/problems/merge-sorted-array/
 * 
 * @author Max_Qiu
 */
public class Issue0088 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        merge(nums1, 3, new int[] {2, 5, 6}, 3);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = new int[] {0};
        merge(nums2, 0, new int[] {1}, 1);
        System.out.println(Arrays.toString(nums2));
    }

    /**
     * 指针法
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 因数组1的后面一段是无效的，所以可以用来存储大的值
        int p = m + n - 1;
        // 从数组1数组2的最后一个有效数字开始遍历
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            // 如果数组1大于数组2
            if (nums1[m] > nums2[n]) {
                // 则将数组1的值存到数组1的后面去
                nums1[p] = nums1[m];
                m--;
            } else {
                // 反之
                nums1[p] = nums2[n];
                n--;
            }
            // 存储较大值的索引-1
            p--;
        }
        // 将数组2未遍历的元素拷贝的数组1
        System.arraycopy(nums2, 0, nums1, 0, n + 1);
    }
}
