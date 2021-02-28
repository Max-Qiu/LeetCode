package com.maxqiu.demo.normal;

/**
 * 二进制求和
 * 
 * https://leetcode-cn.com/problems/add-binary/
 * 
 * @author Max_Qiu
 */
public class Issue0067 {

    public static void main(String[] args) {
        System.out.println(addBinary1("11", "1")); // 100
        System.out.println(addBinary1("1010", "1011")); // 10101

        System.out.println(addBinary2("11", "1")); // 100
        System.out.println(addBinary2("1010", "1011")); // 10101
    }

    public static String addBinary1(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    public static String addBinary2(String a, String b) {
        // 最终返回的String
        StringBuilder s = new StringBuilder();
        // 转为数组
        String[] aSplit = a.split("");
        String[] bSplit = b.split("");
        // 是否需要进位的标记
        boolean needAdd = false;
        // 均从 a b 数组的最后一位开始遍历
        for (int aIndex = aSplit.length - 1, bIndex = b.length() - 1; aIndex >= 0 || bIndex >= 0; aIndex--, bIndex--) {
            // 判断数组是否越级，越界为0，否则为当前字符
            String aChar;
            if (aIndex < 0) {
                aChar = "0";
            } else {
                aChar = aSplit[aIndex];
            }
            String bChar;
            if (bIndex < 0) {
                bChar = "0";
            } else {
                bChar = bSplit[bIndex];
            }
            // 判断字符 0 1 的进位
            if ("1".equals(aChar) && "1".equals(bChar)) {
                if (needAdd) {
                    s.insert(0, "1");
                } else {
                    s.insert(0, "0");
                }
                needAdd = true;
            } else if ("0".equals(aChar) && "0".equals(bChar)) {
                if (needAdd) {
                    s.insert(0, "1");
                } else {
                    s.insert(0, "0");
                }
                needAdd = false;
            } else {
                if (needAdd) {
                    s.insert(0, "0");
                    needAdd = true;
                } else {
                    s.insert(0, "1");
                    needAdd = false;
                }
            }
        }
        // 遍历结束后，继续拼接一个1
        if (needAdd) {
            s.insert(0, "1");
        }
        return s.toString();
    }

}
