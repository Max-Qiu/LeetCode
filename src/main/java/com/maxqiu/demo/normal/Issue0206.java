package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.ListNode;

/**
 * 反转链表
 * 
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 
 * @author Max_Qiu
 */
public class Issue0206 {
    public static void main(String[] args) {
        System.out.println(reverseList1(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
        System.out.println(reverseList2(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
    }

    /**
     * 迭代
     */
    public static ListNode reverseList1(ListNode head) {
        // 目标节点
        ListNode node = null;
        // 若当前节点不等于空
        while (head != null) {
            // 取出下一个节点
            ListNode next = head.next;
            // 当前节点的下一个值为目标节点
            head.next = node;
            // 目标节点为当前节点
            node = head;
            // 最后将当前节点设置为下一个节点
            head = next;
        }
        return node;
    }

    /**
     * 递归（看不懂）
     */
    public static ListNode reverseList2(ListNode head) {
        // 若当前节点为空，或者当前节点的下一个节点也为空，直接返回当前节点
        if (head == null || head.next == null) {
            return head;
        }
        // 递归当前节点的下一个节点
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
