package Test3;

import java.util.*;

/**
 * @ClassName SX_17_树的遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/7/26 9:10
 */
public class SX_17_树的遍历 {
    //前序遍历
    public List<Integer> qianxu1(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        dfs(root, arrayList);
        return arrayList;
    }

    void dfs(TreeNode root, List<Integer> arr) {
        if (root == null) return;
        arr.add(root.val);
        dfs(root.left, arr);
        dfs(root.right, arr);
    }

    //前序遍历的非递归形式
    public List<Integer> qianxu2(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                arr.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop().right;
            }
        }
        return arr;
    }

    //后序遍历
    public List<Integer> houxu(TreeNode root) {
        if (root == null) return null;
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> arr = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            arr.offerFirst(root.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return arr;
    }

    //层序遍历
    public void cengxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node);
            if (node.left!=null){
                queue.offer(node.left);
            }
            if (node.right!=null){
                queue.offer(node.right);
            }
        }
    }

}