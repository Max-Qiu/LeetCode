package com.maxqiu.demo.normal;

/**
 * 两数相加
 *
 * https://leetcode-cn.com/problems/add-two-numbers/
 *
 * @author Max_Qiu
 */
public class Issue0002 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(9);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    /**
     * T：O(max(m,n))
     *
     * S：O(max(m,n))
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(l1.val + l2.val);
        boolean needCarryBit = false;
        if (listNode.val > 9) {
            listNode.val = listNode.val - 10;
            needCarryBit = true;
        }
        if (l1.next == null && l2.next == null) {
            if (needCarryBit) {
                listNode.next = new ListNode(1);
            }
        } else {
            if (l1.next == null) {
                l1.next = new ListNode(0);
            }
            if (l2.next == null) {
                l2.next = new ListNode(0);
            }
            if (needCarryBit) {
                l1.next.val = l1.next.val + 1;
            }
            listNode.next = addTwoNumbers(l1.next, l2.next);
        }
        return listNode;
    }

}

/**
 * 单向链表节点
 */
class ListNode {

    int val;

    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override public String toString() {
        String s = val + "";
        if (this.next != null) {
            s += "," + this.next.toString();
        }
        return s;
    }

}