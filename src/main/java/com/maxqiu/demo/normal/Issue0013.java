package com.maxqiu.demo.normal;

import java.util.HashMap;

/**
 * 罗马数字转整数
 * 
 * https://leetcode-cn.com/problems/roman-to-integer/
 * 
 * @author Max_Qiu
 */
public class Issue0013 {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));// 3
        System.out.println(romanToInt("IV"));// 4
        System.out.println(romanToInt("IX"));// 9
        System.out.println(romanToInt("LVIII"));// 58
        System.out.println(romanToInt("MCMXCIV"));// 1994
        System.out.println(romanToInt("XLIX"));// 49
        System.out.println(romanToInt("CMXCIX"));// 999
    }

    public static int romanToInt(String s) {
        HashMap<String, Integer> valueMap = new HashMap<>(7);
        valueMap.put("I", 1);
        valueMap.put("V", 5);
        valueMap.put("X", 10);
        valueMap.put("L", 50);
        valueMap.put("C", 100);
        valueMap.put("D", 500);
        valueMap.put("M", 1000);
        String[] split = s.split("");
        int count = 0;
        for (int i = 0; i < split.length; i++) {
            Integer i1 = valueMap.get(split[i]);
            // 当前字符不是最后一个字符
            if (i < split.length - 1) {
                // 取下一个字符的值
                Integer i2 = valueMap.get(split[i + 1]);
                // 如果下一个值大于当前值
                if (i2 > i1) {
                    // 即 count 需要加上下一个字符值减去当前字符值
                    i1 = i2 - i1;
                    // 且索引+1，即跳过下一个字符
                    i++;
                }
            }
            // 累加
            count += i1;
        }
        return count;
    }
}
