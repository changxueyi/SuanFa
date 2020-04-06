package LeetCode.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName _144_二叉树的前序遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 15:14
 */
public class _144_二叉树的前序遍历 {
    //前序遍历  递归实现
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    void dfs(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        dfs(root.left, res);
        dfs(root.right, res);
    }

    //使用栈来模拟
    public List<Integer> preorderTraversal02(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                res.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop().right;
            }
        }
        return res;
    }

    //后续遍历
    public List<Integer> preorderTraversal03(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res;
    }


}