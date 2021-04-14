package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.ListNode;

/**
 * 移除链表元素
 * 
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * 
 * @author Max_Qiu
 */
public class Issue0203 {
    public static void main(String[] args) {
        System.out.println(removeElements(
            new ListNode(1,
                new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))),
            6));
        System.out.println(removeElements(null, 1));
        System.out.println(removeElements(new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))), 7));
    }

    public static ListNode removeElements(ListNode head, int val) {
        // 如果这个数为空，返回空
        if (head == null) {
            return null;
        }
        // 如果这个数的值等于目标值
        if (head.val == val) {
            // 返回下一个值的递归
            return removeElements(head.next, val);
        }
        // 如果没有下一个节点，返回当前节点
        if (head.next == null) {
            return head;
        }
        // 最后返回当前节点，并将下一个节点进行递归
        return new ListNode(head.val, removeElements(head.next, val));
    }
}
