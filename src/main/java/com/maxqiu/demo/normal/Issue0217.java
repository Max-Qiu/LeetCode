package com.maxqiu.demo.normal;

import java.util.HashSet;

/**
 * 存在重复元素
 * 
 * https://leetcode-cn.com/problems/contains-duplicate/
 * 
 * @author Max_Qiu
 */
public class Issue0217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[] {1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        // map 是否重复
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
