package Test1;


/**
 * @ClassName SX_55二叉树的深度
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/1 9:51
 */
public class SX_55二叉树的深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}