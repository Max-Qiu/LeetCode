package com.maxqiu.demo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面试题 08.06. 汉诺塔问题
 *
 * https://leetcode-cn.com/problems/hanota-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0806 {
    public static void main(String[] args) {
        hanota(new ArrayList<>(Arrays.asList(1, 0)), new ArrayList<>(), new ArrayList<>());
        hanota(new ArrayList<>(Arrays.asList(2, 1, 0)), new ArrayList<>(), new ArrayList<>());
        hanota(new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1, 0)), new ArrayList<>(), new ArrayList<>());
        hanota(new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)), new ArrayList<>(), new ArrayList<>());
    }

    public static void hanota(List<Integer> a, List<Integer> b, List<Integer> c) {
        move(a.size(), a, b, c);
        System.out.println(c);
    }

    private static void move(int size, List<Integer> a, List<Integer> b, List<Integer> c) {
        if (size == 1) {
            c.add(a.get(a.size() - 1));
            a.remove(a.size() - 1);
        } else {
            move(size - 1, a, c, b);
            c.add(a.get(a.size() - 1));
            a.remove(a.size() - 1);
            move(size - 1, b, a, c);
        }
    }
}
