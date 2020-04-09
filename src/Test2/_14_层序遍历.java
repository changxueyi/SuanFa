package Test2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _14_层序遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/6 16:04
 */
public class _14_层序遍历 {
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    //传来一个链表,要求实现层序遍历，【 【】 【】 【】 【】 【】  】
    public List<List<Integer>> cengxu(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                TreeNode node = queue.poll();
                arr.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(arr);
        }
        return res;
    }

}