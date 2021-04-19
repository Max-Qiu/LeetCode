package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 存在重复元素 II
 * 
 * https://leetcode-cn.com/problems/contains-duplicate-ii/
 * 
 * @author Max_Qiu
 */
public class Issue0219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicate(new int[] {1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2));
        System.out.println(containsNearbyDuplicate(new int[] {13, 23, 1, 2, 3}, 5));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // 长度小于1
        if (nums.length <= 1) {
            return false;
        }
        // 长度等于2
        if (nums.length == 2) {
            return nums[0] == nums[1];
        }
        // 循环，将值和对应的索引放入 map
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> integers = map.get(nums[i]);
            if (integers == null) {
                integers = new ArrayList<>();
            }
            integers.add(i);
            map.put(nums[i], integers);
        }
        // 拿出每个值的所以 list
        for (Integer key : map.keySet()) {
            List<Integer> list = map.get(key);
            // 如果 list 小于1，说明当前值的在数组中只有一个，跳过
            if (list.size() <= 1) {
                continue;
            }
            // 当 list 的长度大于1
            while (list.size() > 1) {
                // 取出第一个索引
                Integer first = list.get(0);
                // 并从 list 中移除
                list.remove(0);
                // 将第一个索引与后面的索引进行比较
                for (Integer integer : list) {
                    // 如果后面的索引和第一个索引相差小于等于k
                    if (integer - first <= k) {
                        // 则符合要求，返回true即可
                        return true;
                    }
                }
            }
        }
        // 所有都遍历完，没有符合的情况，返回false
        return false;
    }
}
