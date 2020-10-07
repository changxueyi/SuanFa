package LeetCode.二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName _94_二叉树中序遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 16:00
 */
public class _94_二叉树中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        //中序遍历
        ArrayList<Integer> arrayList = new ArrayList<>();
        dfs(root, arrayList);
        return arrayList;
    }

    void dfs(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) return;
        dfs(root.left, arrayList);
        arrayList.add(root.val);
        dfs(root.right, arrayList);
    }

    // 二分搜索树的中序遍历
    TreeNode root;

    public void inOrder() {
        inOrder(root);
    }

    // 中序遍历以node为根的二分搜索树, 递归算法
    private void inOrder(TreeNode root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    //中序遍历，非递归实现
    public List<Integer> preorderTraversal01(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

    //15点41分 2020/08/01     北京
    public List<Integer> preorderTraversal02(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }


}