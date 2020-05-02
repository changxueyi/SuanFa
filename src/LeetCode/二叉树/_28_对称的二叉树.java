package LeetCode.二叉树;

/**
 * @ClassName _28_对称的二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/29 21:04
 */
public class _28_对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);

    }

    boolean isMirror(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null || l.val != r.val) return false;

        return isMirror(l.left, r.right) && isMirror(l.right, r.left);
    }


}