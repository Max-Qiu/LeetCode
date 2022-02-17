package com.maxqiu.demo.interview;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 01.04. 回文排列
 *
 * https://leetcode-cn.com/problems/palindrome-permutation-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0104 {
    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("tactcoa"));
    }

    public static boolean canPermutePalindrome(String s) {
        // 创建一个set集合
        Set<Character> set = new HashSet<>();
        // 遍历字符
        for (char c : s.toCharArray()) {
            // 如果存在，则移除
            if (set.contains(c)) {
                set.remove(c);
            }
            // 否则加入
            else {
                set.add(c);
            }
        }
        // 遍历结束后，set中只有一个字符或没有字符，则可以构成回文串
        return set.size() < 2;
    }
}
