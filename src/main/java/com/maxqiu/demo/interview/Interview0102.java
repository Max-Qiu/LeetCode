package com.maxqiu.demo.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 01.02. 判定是否互为字符重排
 *
 * https://leetcode-cn.com/problems/check-permutation-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0102 {
    public static void main(String[] args) {
        System.out.println(checkPermutation("abc", "bca"));
        System.out.println(checkPermutation("abc", "bad"));
    }

    public static boolean checkPermutation(String s1, String s2) {
        // 创建一个map，用于记录每个字符的数量
        Map<Character, Integer> map = new HashMap<>();
        // 先存储s1每个字符的数量
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        // 再遍历s2的每个字符
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            // 存在则数量-1
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) - 1);
            }
            // 不存在直接返回false
            else {
                return false;
            }
        }
        // 最后再遍历每个字符的剩余数量
        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
