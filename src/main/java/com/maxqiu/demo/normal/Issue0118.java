package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 杨辉三角
 * 
 * https://leetcode-cn.com/problems/pascals-triangle/
 * 
 * @author Max_Qiu
 */
public class Issue0118 {
    public static void main(String[] args) {
        System.out.println(generate(10));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> parentList = new ArrayList<>();
        // 0层，返回空
        if (numRows == 0) {
            return parentList;
        }
        // 1层，返回一层
        parentList.add(Collections.singletonList(1));
        if (numRows == 1) {
            return parentList;
        }
        // 大于1层，循环生产，i代表当前是i+1层，即list集合的第i个（第二层，第一个）
        for (int i = 1; i < numRows; i++) {
            // 取上一层list
            List<Integer> lastList = parentList.get(i - 1);
            // 新建当前list
            List<Integer> list = new ArrayList<>();
            // 添加头
            list.add(1);
            // 第二个元素开始，至倒数第二个元素结束
            for (int j = 1; j < i; j++) {
                // 取上一层当前位置元素和上一层当前位置-1的元素 并求和
                list.add(lastList.get(j) + lastList.get(j - 1));
            }
            // 添加尾
            list.add(1);
            // 添加进大集合
            parentList.add(list);
        }
        return parentList;
    }
}
