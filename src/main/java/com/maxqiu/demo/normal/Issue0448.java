package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * 
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * 
 * @author Max_Qiu
 */
public class Issue0448 {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDisappearedNumbers(new int[] {1, 1}));
    }

    /**
     * 计数器方案
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] counter = new int[nums.length];
        for (int i : nums) {
            counter[i - 1] = counter[i - 1] + 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
