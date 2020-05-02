package LeetCode.二叉树;

/**
 * @ClassName _68_二叉搜索树的最近公共祖先
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/1 10:19
 */
public class _68_二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode == null)
            return rightNode;
        if (rightNode == null)
            return leftNode;

        return root;
    }

}