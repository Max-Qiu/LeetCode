package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 *
 * https://leetcode-cn.com/problems/self-dividing-numbers/submissions/
 *
 * @author Max_Qiu
 */
public class Issue0728 {
    public static void main(String[] args) {

        System.out.println('1');
        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        // 遍历
        for (; left <= right; ++left) {
            boolean flag = true;
            // 遍历每一个字母
            for (char c : String.valueOf(left).toCharArray()) {
                // 如果该字母等于0或者该字母不能整除
                if (c == '0' || left % (c - '0') > 0) {
                    // 不添加到集合中
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans.add(left);
            }
        }
        return ans;
    }
}
