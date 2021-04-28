package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.List;

import com.maxqiu.demo.entity.ListNode;

/**
 * 回文链表
 * 
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * 
 * @author Max_Qiu
 */
public class Issue0234 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2))));
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        // 使用双指针判断是否回文
        int front = 0;
        int back = list.size() - 1;
        while (front < back) {
            if (!list.get(front).equals(list.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
