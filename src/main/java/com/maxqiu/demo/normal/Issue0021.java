package com.maxqiu.demo.normal;

/**
 * 合并两个有序链表
 * 
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * 
 * @author Max_Qiu
 */
public class Issue0021 {

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
            new ListNode(1, new ListNode(3, new ListNode(4)))));
        System.out.println(mergeTwoLists(null, null));
        System.out.println(mergeTwoLists(null, new ListNode(0)));
    }

    /**
     * 递归求解
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 如果节点1为null，直接返回节点2
        if (l1 == null) {
            return l2;
        }
        // 同理
        if (l2 == null) {
            return l1;
        }
        // 比较节点1与节点2的值
        if (l1.val < l2.val) {
            // 则返回一个节点，值为节点1的值，下个节点为节点1的下一个值与节点2比较后的结果
            return new ListNode(l1.val, mergeTwoLists(l2, l1.next));
        } else {
            // 同理
            return new ListNode(l2.val, mergeTwoLists(l1, l2.next));
        }
    }

    /**
     * 单向链表节点
     */
    static class ListNode {

        int val;

        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            String s = val + "";
            if (this.next != null) {
                s += "," + this.next.toString();
            }
            return s;
        }

    }

}
