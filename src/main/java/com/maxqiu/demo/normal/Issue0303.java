package com.maxqiu.demo.normal;

/**
 * @author Max_Qiu
 */
public class Issue0303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }

    static class NumArray {
        int[] sums;

        public NumArray(int[] nums) {
            sums = new int[nums.length + 1];
            // 遍历数组，计算截止当前数字的所有数字的和
            for (int i = 0; i < nums.length; i++) {
                sums[i + 1] = sums[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return sums[right + 1] - sums[left];
        }
    }
}
