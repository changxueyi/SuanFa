package LeetCode.二叉树;

/**
 * @ClassName _55_二叉树的深度
 * @Description https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/solution/mian-shi-ti-55-i-er-cha-shu-de-shen-du-xian-xu-bia/
 * @Author changxueyi
 * @Date 2020/4/6 9:39
 */
public class _55_二叉树的深度 {
    public class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 终止条件： 当 root​ 为空，说明已越过叶节点，因此返回 深度 00 。
     * 关键点： 此树的深度和其左（右）子树的深度之间的关系。显然，此树的深度
     * 等于 左子树的深度 与 右子树的深度 中的 最大值 +1
     * @param root 使用深度优先遍历 DFS 先序遍历
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    //方法二：使用广度优先遍历， BFS 即层序遍历
    //树的层序遍历 / 广度优先搜索往往利用 队列 实现。
    //关键点： 每遍历一层，则计数器 +1 ，直到遍历完成，则可得到树的深度。



}