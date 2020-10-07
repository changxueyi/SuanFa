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

    //15点21分 2020/07/25 北京
    public boolean isSymmetric1(TreeNode root) {
        if (root == null) return true;
        return mirror(root.left, root.right);
    }

    boolean mirror(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null || l.val != r.val) return false;

        return mirror(l.left, r.right) && mirror(l.right, r.left);
    }

    //14点47分 2020/08/01 判断对称的二叉树
    public boolean isSymmetric3(TreeNode root) {
        if (root == null) return true;
        return mirror1(root.left, root.right);
    }

    boolean mirror1(TreeNode l, TreeNode r) {
        if (l==null&& r==null) return true;
        if (l==null||r==null||l.val!=r.val) return false;
        return mirror1(l.left,r.right)&&mirror1(l.right,r.right);
    }


}