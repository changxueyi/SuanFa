package LeetCode.二叉树;


/**
 * @ClassName _27_二叉树的镜像
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/29 16:38
 */

/**
 * 例如输入：
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 镜像输出：
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class _27_二叉树的镜像 {
    //最容易理解的解法
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return root;
        //业务处理
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

    //北京 14点43分 2020/08/01
    public TreeNode fun(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        fun(root.left);
        fun(root.right);

        return root;
    }

    //博客大神解法二：我们先前序遍历这棵树的每个结点，如果遍历的结点有子节点，
    // 就交换它的两个子节点，当交换完所有的非叶子结点的左右子节点之后，我们就得到了树的镜像
    //https://blog.csdn.net/pcwl1206/article/details/86003097
    // 递归思想
    public TreeNode mirrorTree1(TreeNode root) {
        if (root == null) {
            return root;
        }
        //只有一个节点时，即：只有根节点
        if (root.left == null && root.right == null) {
            return root;
        }
        //交换当前节点的左右子节点
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //左子树递归
        if (root.left != null) {
            mirrorTree1(root.left);
        }
        //右子树递归
        if (root.right != null) {
            mirrorTree1(root.right);
        }
        return root;
    }


    //Krahets 大神的解法
    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = mirrorTree2(root.right);
        root.right = mirrorTree2(temp);
        return root;
    }


    public static void main(String[] args) {
        _27_二叉树的镜像 aa = new _27_二叉树的镜像();
        TreeNode treeNode = aa.mirrorTree(new TreeNode(1));
        System.out.println(treeNode);
    }
}