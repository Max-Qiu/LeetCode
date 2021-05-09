package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.List;

import com.maxqiu.demo.entity.TreeNode;

/**
 * 二叉树的所有路径
 * 
 * https://leetcode-cn.com/problems/binary-tree-paths/
 * 
 * @author Max_Qiu
 */
public class Issue0257 {
    public static void main(String[] args) {
        System.out.println(binaryTreePaths(new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3))));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        String parent = root.val + "";
        list.addAll(append(root, parent));
        return list;
    }

    public static List<String> append(TreeNode node, String parent) {
        if (node.left == null && node.right == null) {
            ArrayList<String> list = new ArrayList<>();
            list.add(parent);
            return list;
        }
        if (node.left != null && node.right == null) {
            return append(node.left, parent + "->" + node.left.val);
        }
        if (node.left == null) {
            return append(node.right, parent + "->" + node.right.val);
        }
        List<String> list = append(node.left, parent + "->" + node.left.val);
        list.addAll(append(node.right, parent + "->" + node.right.val));
        return list;
    }
}
