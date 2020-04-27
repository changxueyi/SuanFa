package LeetCode.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName _102_二叉树的层序遍历
 * @Description 思路如下：
 * 1.创建一个list用于存放最终的结果
 * 2.判断root节点是否为空，为空，返回list
 * 3.创建一个队列 ，队列中节点存放的是TreeNode
 * 4. 把根节点添加到队列中
 * 5.当队列不为空时候
 * 创建一个临时存放每组节点的列表，列表中的元素是普通的元素值
 * 6. 定义一个队列长度
 * 7.for 循环遍历这个队列
 * 把队列的一个节点弹出来，添加到刚刚临时存放的数组中
 * 如果这个元素的左孩子不为空，把左孩子放在队列
 * 如果这个元素的右孩子不为空，把右孩子放在队列
 * 8.循环遍历完毕，把临时表元素放在 最终表元素中
 * 9.返回 最终表
 * @Author changxueyi
 * @Date 2020/4/6 10:09
 */
public class _102_二叉树的层序遍历 {
    //非递归实现
    public List<List<Integer>> levelOrder(TreeNode root) {
        //创建一个二维数组接收每层的节点
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        //创建队列用于存放每层的节点
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        //此处或者使用q.offer(root) ,offer 是队列进对的方式
        while (!q.isEmpty()) {
            //创建数组用来接收出队的结点，存放的是每层的结点
            List<Integer> tmp = new ArrayList<>();
            int len = q.size();
            for (int i = 0; i < len; i++) {
                //定义node接收出队节点，然后加入数组tmp中，
                //把这个节点弹出来，放入数组中
                //poll：将首个元素从队列中弹出，如果队列是空的，就返回null
                TreeNode node = q.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(tmp);
        }
        return ans;
    }

    //递归解法
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> levelOrderDFS(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        DFS(root, 0);
        return lists;

    }

    private void DFS(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        //当前层数还没有元素，先new一个空的列表
        if (lists.size() <= level) {
            lists.add(new ArrayList<>());
        }
        //当前值加入
        lists.get(level).add(root.val);
        DFS(root.left, level + 1);
        DFS(root.right, level + 1);
    }

    //小码哥实现的方法，简洁易懂
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> tmp = new ArrayList<>();
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                while (!queue.isEmpty()) {
                    TreeNode node = queue.poll();
                    tmp.add(node.val);
                    if (node.left != null) {
                        queue.offer(root.left);
                    }
                    if (node.right != null) {
                        queue.offer(root.right);
                    }
                }
            }
            ans.add(tmp);
        }
        return ans;
    }


    //如果单纯的让写个层序遍历,直接使用小码哥的就可以了
    public void levelOrderTraversal(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            //poll：将首个元素从队列中弹出，如果队列是空的，就返回null
            System.out.println(node);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }



}