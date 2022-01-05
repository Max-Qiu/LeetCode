package com.maxqiu.demo.normal;

import java.util.HashSet;
import java.util.Set;

/**
 * 804. 唯一摩尔斯密码词
 *
 * https://leetcode-cn.com/problems/unique-morse-code-words/
 *
 * @author Max_Qiu
 */
public class Issue0804 {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        // 摩斯密码
        String[] morse = new String[] {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        // 存储单词翻译后的结果
        Set<String> seen = new HashSet<>();
        // 遍历单词
        for (String word : words) {
            // 单个单词翻译结果
            StringBuilder code = new StringBuilder();
            // 遍历每个字符
            for (char c : word.toCharArray()) {
                // 拼接密文
                code.append(morse[c - 'a']);
            }
            // 存入set
            seen.add(code.toString());
        }
        // 因为 set 不重复，所以返回大小即可
        return seen.size();
    }
}
