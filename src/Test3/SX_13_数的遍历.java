package Test3;

import 并发泛型反射.线程.ThreadTest;

import java.util.*;

/**
 * @ClassName SX_13_数的遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/25 15:11
 */
public class SX_13_数的遍历 {
    //前序遍历
    //  TreeNode root;
    public void qianxu(TreeNode root) {
        dfs(root);
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        System.out.println(root);
        dfs(root.left);
        dfs(root.right);
    }

    //第二种前序遍历
    public List<Integer> qianxu1(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        qianxu1(root, arr);
        return arr;
    }

    void qianxu1(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) return;
        qianxu1(root.left, arrayList);
        arrayList.add(root.val);
        qianxu1(root.right, arrayList);
    }

    //后序遍历非递归，使用栈实现
    public static List<Integer> postorderTraversal(TreeNode root) {
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

    public void cengxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    public List<Integer> qianxu11(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                list.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop().right;
            }
        }
        return list;
    }

    public List<Integer> zhongxu(TreeNode root) {
        Stack<TreeNode> res = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        while (cur != null || res != null) {
            if (cur != null) {
                res.push(cur);
                cur = cur.left;
            } else {
                cur = res.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }


    public static void main(String[] args) {
        TreeNode E = new TreeNode(4, null, null);
        TreeNode D = new TreeNode(5, null, null);
        TreeNode C = new TreeNode(3, E, D);
        TreeNode B = new TreeNode(2, null, null);
        TreeNode A = new TreeNode(1, B, C);
        List<Integer> list = postorderTraversal(A);
        System.out.println("-----list的输出结果-----");
        for (int i = 0; i < list.size(); i++) {    // for循环方式
            System.out.print(list.get(i) + " ");
        }
    }


}