package LeetCode.二叉树;

/**
 * @ClassName _100_相同的树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/29 16:13
 */
public class _100_相同的树 {
    //给定两个二叉树，编写一个函数来检验它们是否相同。
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}