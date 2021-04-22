package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.TreeNode;

/**
 * 翻转二叉树
 * 
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * 
 * @author Max_Qiu
 */
public class Issue0226 {
    public static void main(String[] args) {
        System.out.println(invertTree(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(7, new TreeNode(6), new TreeNode(9)))));
    }

    public static TreeNode invertTree(TreeNode root) {
        // 当前节点为空，返回空
        if (root == null) {
            return null;
        }
        // 左右节点均为空，直接返回
        if (root.left == null && root.right == null) {
            return root;
        }
        // 类似于交换 a b 两个数字，只不过多了递归
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
}
