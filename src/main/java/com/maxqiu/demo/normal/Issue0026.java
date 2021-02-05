package com.maxqiu.demo.normal;

/**
 * 删除排序数组中的重复项
 * 
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 
 * @author Max_Qiu
 */
public class Issue0026 {

    public static void main(String[] args) {
        print(new int[] {1, 1, 2});
        print(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }

    /**
     * 打印
     */
    public static void print(int[] nums) {
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 用于标记当前不重复的值的索引位置
        int index = 0;
        // 从第二个元素开始遍历数组
        for (int i = 1; i < nums.length; i++) {
            // 如果当前元素和不重复值的最后一个元素值不相同
            if (nums[i] != nums[index]) {
                // 则不重复数组索引 +1
                index++;
                // 且不重复数组最后一个值为当前元素值
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

}
