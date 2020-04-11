package LeetCode.二叉树;

import java.util.Objects;
import java.util.Stack;

/**
 * @ClassName _54_二叉搜索树的第K大节点
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 14:51
 */
public class _54_二叉搜索树的第K大节点 {
    //反向中序遍历，当遍历到第K个节点的时候，返回该节点指
    public int kthLargest(TreeNode root, int k) {
        //count 用于指示已经查找过的数字个数
        int count = 0;
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.right;
            } else {
                p = stack.pop();
                count++;
                if (count == k) return p.val;
                p = p.left;
            }
        }
        return 0;
    }
}