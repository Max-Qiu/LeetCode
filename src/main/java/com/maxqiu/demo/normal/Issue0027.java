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
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
