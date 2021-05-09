package com.maxqiu.demo.normal;

import java.util.HashMap;

/**
 * 单词规律
 * 
 * https://leetcode-cn.com/problems/word-pattern/submissions/
 * 
 * @author Max_Qiu
 */
public class Issue0290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        // 单词切割成list
        String[] list = s.split(" ");
        // 如果单词list长度和pattern长度不一样
        if (pattern.length() != list.length) {
            // 则返回false
            return false;
        }
        // 用 map 存储字母与单词对应的键值对
        HashMap<Character, String> map = new HashMap<>(s.length());
        // 遍历字母
        for (int i = 0; i < pattern.length(); i++) {
            // 如果当前字母在 map 中
            if (map.containsKey(pattern.charAt(i))) {
                // 如果当前字母在 map 中对应的单词与当前单词不一样，返回 false
                if (!map.get(pattern.charAt(i)).equals(list[i])) {
                    return false;
                }
            }
            // 如果当前字母不在 map 中
            else {
                // 如果当前字母在 map 的 value 中能找到，说明出现不对应的情况，返回 false
                if (map.containsValue(list[i])) {
                    return false;
                }
                // 将当前字母和当前单词放入 map
                map.put(pattern.charAt(i), list[i]);
            }
        }
        return true;
    }
}
