package Test1;

/**
 * @ClassName SX_二叉树的镜像
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/1 9:56
 */
public class SX_二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        mirrorTree(root.left);
        mirrorTree(root.right);

        //业务处理
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}