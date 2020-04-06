package LeetCode.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName _145_二叉树的后序遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 16:20
 */
public class _145_二叉树的后序遍历 {
    public List<Integer> postorderTraversal01(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode root) {
        if (root == null) return;
        dfs(res, root.left);
        dfs(res, root.right);
        res.add(root.val);
    }


    //非递归
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }

}