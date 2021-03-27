package com.maxqiu.demo.normal;

import java.util.HashMap;

/**
 * 多数元素
 * 
 * https://leetcode-cn.com/problems/majority-element/
 * 
 * @author Max_Qiu
 */
public class Issue0169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3, 2, 3}));
        System.out.println(majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        // 新建一个map，用于存储数字和数字的次数
        HashMap<Integer, Integer> map = new HashMap<>();
        // 用于记录最大数字
        int num = Integer.MIN_VALUE;
        // 用于记录最大数字的次数
        int count = Integer.MIN_VALUE;
        // 遍历
        for (int j : nums) {
            // 获取次数
            Integer temp = map.get(j);
            // 次数不存在，设为1，存在则+1
            if (temp == null) {
                temp = 1;
            } else {
                temp++;
            }
            // 如果当前次数大于最大数字的次数，则修改最大数字和次数
            if (temp > count) {
                num = j;
                count = temp;
            }
            // 最后将该数字的次数放入集合
            map.put(j, temp);
        }
        // 返回最大数字
        return num;
    }
}
