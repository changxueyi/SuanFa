package LeetCode.二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _32_III从上到下打印二叉树
 * @Description TODO https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 * @Author changxueyi
 * @Date 2020/5/3 9:44
 */
public class _32_III从上到下打印二叉树 {
    //直接用list也可以头插法就直接是逆序的
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            count++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (count%2==1){
                    //说明是直接打印,奇数直接打印，偶数反过来打印
                    list.add(node.val);
                }else {
                    list.add(0,node.val);
                }
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

}