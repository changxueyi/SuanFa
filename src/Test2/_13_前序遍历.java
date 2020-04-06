package Test2;

import LeetCode.二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName _13_前序遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/6 8:28
 */
public class _13_前序遍历 {
    public class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public ArrayList<Integer> qianxu(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        dft(arrayList, root);
        return arrayList;
    }

    void dft(ArrayList arrayList, TreeNode root) {
        if (root == null) return;
        arrayList.add(root);
        dft(arrayList, root.left);
        dft(arrayList, root.right);
    }

    public List<Integer> preorderTraversal03(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                res.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            } else
                cur = stack.pop().right;
        }
        return res;
    }

}