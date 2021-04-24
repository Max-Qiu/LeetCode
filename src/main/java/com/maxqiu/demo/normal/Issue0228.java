package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * 汇总区间
 * 
 * https://leetcode-cn.com/problems/summary-ranges/
 * 
 * @author Max_Qiu
 */
public class Issue0228 {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[] {0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges(new int[] {0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> stringList = new ArrayList<>();
        if (nums.length == 0) {
            return stringList;
        }
        // 开始的数字
        int start = nums[0];
        // 上一个数字
        int last = nums[0];
        // 遍历
        for (int i = 1; i < nums.length; i++) {
            // 如果当前数字和上一个数字差值不等于1，说明存在区间间隔
            if (nums[i] - last != 1) {
                // 如果上一个数字就是开始的数字
                if (last == start) {
                    // 则直接添加开始的数字
                    stringList.add(start + "");
                }
                // 否则添加开始数字至上个数字的区间
                else {
                    stringList.add(start + "->" + last);
                }
                // 存在区间，刷新开始的数字
                start = nums[i];
            }
            // 刷新上一个数字
            last = nums[i];
        }
        if (last == start) {
            stringList.add(start + "");
        } else {
            stringList.add(start + "->" + last);
        }
        return stringList;
    }
}
