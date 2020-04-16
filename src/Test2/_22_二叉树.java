package Test2;

import LeetCode.二叉树.TreeNode;

import java.util.Stack;

/**
 * @ClassName _22_二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/16 14:37
 */
public class _22_二叉树 {
    public class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode root;

    public void preOrder() {
        preOrder(root);
    }

    void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    //递归解法
    public void preOrder01(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack != null) {
            stack.pop();
            if (root.left != null) {
                stack.push(root.left);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
        }
    }

    //前序遍历
    public void preOrder02(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node);
            if (node.left != null)
                stack.push(root.left);
            if (node.right != null)
                stack.push(root.right);
        }
    }
    //中序遍历

    //二叉树的遍历
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return root;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }


}