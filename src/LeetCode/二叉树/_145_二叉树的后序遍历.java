package LeetCode.二叉树;

import java.util.*;

/**
 * @ClassName _145_二叉树的后序遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 16:20
 */
public class _145_二叉树的后序遍历 {
    public List<Integer> postorderTraversal01(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode root) {
        if (root == null) return;
        dfs(res, root.left);
        dfs(res, root.right);
        res.add(root.val);
    }


    //非递归
    public static List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            //pollLast 返回列表的最后一个元素并从列表中移除
            //public E pollLast()：检索并删除此列表的最后一个元素，如果此列表为空，则返回null。
            // offerLast(element)指定元素添加在列表的末尾,
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
    public static TreeNode init() {//注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错
        TreeNode E = new TreeNode(4, null, null);
        TreeNode D = new TreeNode(5, null, null);
        TreeNode C = new TreeNode(3, E, D);
        TreeNode B = new TreeNode(2, null, null);
        TreeNode A = new TreeNode(1, B, C);
        return A;   //返回根节点
    }

    public static void main(String[] args) {
        _145_二叉树的后序遍历 tree = new _145_二叉树的后序遍历();
        TreeNode root = tree.init();
        System.out.println("后序遍历");
        tree.postorderTraversal(root);

        List<Integer> reverseList = postorderTraversal(root);
        System.out.println(Arrays.toString(reverseList.toArray()));

    }



}