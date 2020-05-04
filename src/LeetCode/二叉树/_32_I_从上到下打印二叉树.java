package LeetCode.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _32_I_从上到下打印二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 8:58
 */
public class _32_I_从上到下打印二叉树 {
    //字节跳动经典面试题
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}