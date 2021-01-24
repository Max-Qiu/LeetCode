package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * 
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 
 * @author Max_Qiu
 */
public class Issue0003 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring1("bbbbb")); // 1
        System.out.println(lengthOfLongestSubstring1("pwwkew")); // 3
        System.out.println(lengthOfLongestSubstring1("aab")); // 2
        System.out.println(lengthOfLongestSubstring1("dvdf")); // 3
        System.out.println(lengthOfLongestSubstring1("")); // 0
        System.out.println("---------------------------------");
        System.out.println(lengthOfLongestSubstring2("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring2("bbbbb")); // 1
        System.out.println(lengthOfLongestSubstring2("pwwkew")); // 3
        System.out.println(lengthOfLongestSubstring2("aab")); // 2
        System.out.println(lengthOfLongestSubstring2("dvdf")); // 3
        System.out.println(lengthOfLongestSubstring2("")); // 0
    }

    public static int lengthOfLongestSubstring1(String s) {
        if ("".equals(s)) {
            return 0;
        }
        // 长度
        int length = 0;
        // 字符串拆分字母数组
        String[] split = s.split("");
        // 定义一个ArrayList用于存储不同的字符串
        ArrayList<String> list = new ArrayList<>();
        // 遍历字母数组
        for (String letter : split) {
            // 查询当前字符串在集合中的位置
            int index = list.indexOf(letter);
            // 判断是否在集合中（即重复）
            if (index >= 0) {
                // 重新计算长度之前，记录最大长度
                if (list.size() > length) {
                    length = list.size();
                }
                // 删除重复元素之前的元素（包含该重复元素）
                list.subList(0, index + 1).clear();
            }
            // 该元素添加至数组
            list.add(letter);
        }
        return Math.max(list.size(), length);
    }

    public static int lengthOfLongestSubstring2(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

}
