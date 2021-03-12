package com.maxqiu.demo.normal;

/**
 * 最长公共前缀
 * 
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * 
 * @author Max_Qiu
 */
public class Issue0014 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[] {"dog", "racecar"}));
        System.out.println(longestCommonPrefix(new String[] {"dog", "dog"}));
        System.out.println(longestCommonPrefix(new String[] {"dog"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 取出第一个字符串
        String first = strs[0];
        // 遍历第一个字符串的每一个字母
        for (int i = 0; i < first.length(); i++) {
            // 从第二个字符串开始遍历
            for (int j = 1; j < strs.length; j++) {
                // 1. 如果后面的字符串长度等于当前字符的索引位置，即后面的字符串不够长了
                // 2. 如果后面的字符串当前索引位置字符和第一个字符串当前索引位置不相同
                if (strs[j].length() == i || first.charAt(i) != strs[j].charAt(i)) {
                    // 则直接截取第一个字符串从头到当前索引位置的字符（截取时不包含当前索引位置）
                    return first.substring(0, i);
                }
            }
        }
        // 如果第一个字符串遍历完了，则直接返回第一个字符串
        return strs[0];
    }
}
