package 二叉树;

import Test2._22_二叉树;

import java.util.Stack;

/**
 * @ClassName 遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/16 14:56
 */
public class 遍历 {
    public class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode root;

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
    public void preOrder03(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                System.out.println(root.val);
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                root = root.right;
            }
        }
    }

}