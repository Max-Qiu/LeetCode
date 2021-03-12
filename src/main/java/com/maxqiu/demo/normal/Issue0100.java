package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.TreeNode;

/**
 * 相同的树
 * 
 * https://leetcode-cn.com/problems/same-tree/
 * 
 * @author Max_Qiu
 */
public class Issue0100 {
    public static void main(String[] args) {
        System.out.println(isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
            new TreeNode(1, new TreeNode(2), new TreeNode(3))));

        System.out.println(isSameTree(new TreeNode(1, new TreeNode(2), null), new TreeNode(1, null, new TreeNode(3))));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
