package com.maxqiu.demo.interview;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 01.01. 判定字符是否唯一
 *
 * https://leetcode-cn.com/problems/is-unique-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0101 {
    public static void main(String[] args) {
        System.out.println(isUnique("leetcode"));
        System.out.println(isUnique("abc"));
    }

    public static boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            char c = astr.charAt(i);
            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }
        return true;
    }
}
