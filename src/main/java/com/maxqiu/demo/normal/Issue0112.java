package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.TreeNode;

/**
 * 路径总和
 * 
 * https://leetcode-cn.com/problems/path-sum/
 * 
 * @author Max_Qiu
 */
public class Issue0112 {
    public static void main(String[] args) {
        System.out.println(
            hasPathSum(new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))), 22));
        System.out.println(hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5));
        System.out.println(hasPathSum(new TreeNode(1, new TreeNode(2), null), 0));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        // 若当前节点为空，则返回false
        if (root == null) {
            return false;
        }
        // 若没有子节点
        if (root.left == null && root.right == null) {
            // 且目标值等于当前节点值，返回true，否则返回false
            return root.val == targetSum;
        }
        // 若有子节点
        // 将目标值减去当前值得到一个新的目标值
        targetSum = targetSum - root.val;
        // 递归，左右子节点有一个匹配即可
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
