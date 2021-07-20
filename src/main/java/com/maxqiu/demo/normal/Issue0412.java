package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 * 
 * https://leetcode-cn.com/problems/fizz-buzz/
 * 
 * @author Max_Qiu
 */
public class Issue0412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (s.length() == 0) {
                s = i + "";
            }
            list.add(s);
        }
        return list;
    }
}
