package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * 我的日程安排表 I
 *
 * https://leetcode.cn/problems/my-calendar-i/submissions/
 *
 * @author Max_Qiu
 */
public class Issue0729 {
    public static void main(String[] args) {
        MyCalendar calendar = new MyCalendar();
        System.out.println(calendar.book(10, 20));
        System.out.println(calendar.book(15, 30));
        System.out.println(calendar.book(20, 40));
    }

    private static class MyCalendar {
        List<int[]> set;

        public MyCalendar() {
            set = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (int[] array : set) {
                if (array[0] < end && start < array[1]) {
                    return false;
                }
            }
            set.add(new int[] {start, end});
            return true;
        }
    }
}
