package Test3;


import java.util.*;

/**
 * @ClassName SX_14_树的遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/26 14:18
 */
public class SX_14_树的遍历 {
    //最垃圾的递归算法
    public List<Integer> qianxu01(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        dfs(root, arrayList);
        return arrayList;
    }

    void dfs(TreeNode root, List<Integer> arrayList) {
        if (root == null) return;
        arrayList.add(root.val);
        dfs(root.left, arrayList);
        dfs(root.right, arrayList);
    }

    //非递归实现前序遍历
    public List<Integer> qianxu02(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                arr.add(root.val);
                stack.push(root);
                cur = cur.left;
            } else {
                cur = stack.pop().right;
            }
        }
        return arr;
    }

    //中序遍历 --使用递归来实现
    public List<Integer> zhongxu01(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        TreeNode cur = root;
        while (stack != null || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode pre = stack.pop();
                arr.add(pre.val);
                cur = cur.right;
            }
        }
        return arr;
    }

    //后序遍历
    public List<Integer> houxu(TreeNode root) {
        if (root == null) return null;
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> arr = new LinkedList();

        //arr.add(root.val);
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            arr.offerFirst(root.val);
            if (node.left != null) {
                stack.add(root.left);
            }
            if (node.right != null) {
                stack.add(root.right);
            }
        }
        return arr;
    }

    //层序遍历
    public void cengxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        //arr.add(root.val);
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node);
            if (node.left != null) {
                queue.offer(root.left);
            }
            if (node.right != null) {
                queue.offer(root.right);
            }
        }
    }


}