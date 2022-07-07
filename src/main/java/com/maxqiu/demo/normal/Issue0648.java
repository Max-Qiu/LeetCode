package com.maxqiu.demo.normal;

import java.util.Arrays;
import java.util.List;

/**
 * 单词替换
 *
 * https://leetcode.cn/problems/replace-words/
 *
 * @author Max_Qiu
 */
public class Issue0648 {
    public static void main(String[] args) {
        System.out.println(replaceWords(Arrays.asList("cat", "bat", "rat"), "the cattle was rattled by the battery")); // the cat was rat by the bat
        System.out.println(replaceWords(Arrays.asList("a", "b", "c"), "aadsfasf absbs bbab cadsfafs")); // a a b c
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (String d : dictionary) {
                if (s[i].startsWith(d)) {
                    s[i] = d;
                }
            }
        }
        return String.join(" ", s);
    }
}
