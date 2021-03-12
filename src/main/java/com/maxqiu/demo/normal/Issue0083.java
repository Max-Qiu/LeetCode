package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.ListNode;

/**
 * 删除排序链表中的重复元素
 * 
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * 
 * @author Max_Qiu
 */
public class Issue0083 {
    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(1)));
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))));
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(1)))));
        System.out.println(
            deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        // 如果当前节点为空，则返回null
        if (head == null) {
            return null;
        }
        // 如果当前节点的下一个值为空，则返回当前节点
        if (head.next == null) {
            return head;
        }
        // 如果当前节点的值和下个节点的值相同
        if (head.val == head.next.val) {
            // 则当前节点等于下个节点的递归
            head = deleteDuplicates(head.next);
        } else {
            // 否则下个节点等于下个节点的递归
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }
}
