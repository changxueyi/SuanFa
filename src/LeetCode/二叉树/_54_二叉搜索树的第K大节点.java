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

    //其实跟中序遍历代码差不多，多的也就是加了count，用来判断是否是等于K的
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

    //使用递归解答
    //https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/solution/mian-shi-ti-54-er-cha-sou-suo-shu-de-di-k-da-jie-d/
    //根据中序遍历是递增的，变化下，限制更改中序遍历倒序，即为递减序列
    //终止条件： 当节点 rootroot 为空（越过叶节点），则直接返回；
    //递归右子树 dfs(root.right)
    //三项工作：
    //提前返回： 若 k = 0k=0 ，代表已找到目标节点，无需继续遍历，因此直接返回；
    //统计序号： 执行 k = k - 1k=k−1 （即从 kk 减至 00 ）；
    //记录结果： 若 k = 0k=0 ，代表当前节点为第 kk 大的节点，因此记录 res = root.valres=root.val ；
    int res, k; //res记录的是当前节点的val值，K是指求当前这个元素的第K大个值

    public int kthLargest1(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null) return;//递归终止条件
        dfs(root.right);
        if (k == 0) return;
        if (--k == 0) res = root.val;
        dfs(root.left);
    }
}