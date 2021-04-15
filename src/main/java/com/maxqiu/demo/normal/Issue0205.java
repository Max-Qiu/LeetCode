package com.maxqiu.demo.normal;

import java.util.HashMap;

/**
 * 同构字符串
 * 
 * https://leetcode-cn.com/problems/isomorphic-strings/
 * 
 * @author Max_Qiu
 */
public class Issue0205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "babd"));
    }

    public static boolean isIsomorphic(String s, String t) {
        // 用 map 存储字母对应的键值对
        HashMap<Character, Character> map = new HashMap<>(s.length());
        // 遍历字母
        for (int i = 0; i < s.length(); i++) {
            // 如果 key 在 map 中
            if (map.containsKey(s.charAt(i))) {
                // 如果两个 key 对应的 value 不一样，说明 key 不一样，返回 false
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            // 如果 key 不在 map 中
            else {
                // 如果 key 在 value 中能找到，说明出现不对应的情况，返回 false
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                // 将 key 和 value 放入 map
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
