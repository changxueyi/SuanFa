package LeetCode.二叉树;

/**
 * @ClassName lc_101_对称的二叉树
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/29 16:25
 */
public class lc_101_对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        //给定一个二叉树，检查它是否是镜像对称的

        //判断两个指针当前节点值是否相等
        //判断 A 的右子树与 B 的左子树是否对称
        //判断 A 的左子树与 B 的右子树是否对称
        if (root == null) return true;

        return isMirror(root, root);
    }

    boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;


        //最难理解的一句话
        return (t1.val == t2.val)
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }

    //另一种，可以看懂的一种
    public boolean isSymmetric1(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 递归调用判断左右子树
        return isSameTree(root.left, root.right);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        // 判断左右子树的左边是否等于右边


        //最难理解的一句话
        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }
}