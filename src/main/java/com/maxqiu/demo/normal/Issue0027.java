package com.maxqiu.demo.normal;

/**
 * 移除元素
 * 
 * https://leetcode-cn.com/problems/remove-element/
 * 
 * @author Max_Qiu
 */
public class Issue0027 {
    public static void main(String[] args) {
        print(new int[] {3, 2, 2, 3}, 3);
        print(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }

    /**
     * 打印
     */
    public static void print(int[] nums, int val) {
        int len = removeElement(nums, val);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

    public static int removeElement(int[] nums, int val) {
        // 用于标记不需要移除的元素索引
        int index = 0;
        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 如果当前元素是不需要移除的，
            if (nums[i] != val) {
                // 则将当前元素放在标记索引处
                nums[index] = nums[i];
                // 同时索引+1，准备存放下一个不需要移除的元素
                index++;
            }
        }
        return index;
    }
}
