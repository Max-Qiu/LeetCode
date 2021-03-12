package com.maxqiu.demo.normal;

/**
 * 搜索插入位置
 * 
 * https://leetcode-cn.com/problems/search-insert-position/
 * 
 * @author Max_Qiu
 */
public class Issue0035 {
    public static void main(String[] args) {
        System.out.println(searchInsert1(new int[] {1, 3, 5, 6}, 5)); // 2
        System.out.println(searchInsert1(new int[] {1, 3, 5, 6}, 2)); // 1
        System.out.println(searchInsert1(new int[] {1, 3, 5, 6}, 7)); // 4
        System.out.println(searchInsert1(new int[] {1, 3, 5, 6}, 0)); // 0
    }

    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert1(int[] nums, int target) {
        // 左索引
        int left = 0;
        // 右索引
        int right = nums.length - 1;
        // 如果左索引小于右索引
        while (left <= right) {
            // 计算中间索引（先计算左右差值，再右移一位即取一半，再加上左边的值）
            int mid = ((right - left) >> 1) + left;
            // 如果目标值小于等于中间值
            if (target <= nums[mid]) {
                // 右索引为中间索引-1
                right = mid - 1;
            }
            // 否则
            else {
                // 左索引值为中间索引+1
                left = mid + 1;
            }
        }
        return right + 1;
    }
}
