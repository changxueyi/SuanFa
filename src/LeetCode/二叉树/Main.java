package LeetCode.二叉树;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/3 16:15
 */
public class Main {
    //前序测试
    public static void main(String[] args) {
        TreeNode[] node = new TreeNode[7];//以数组形式生成一棵完全二叉树
        for (int i = 0; i < 7; i++) {
            node[i] = new TreeNode(i);
        }
        for (int i = 0; i < 7; i++) {
            if (i * 2 + 1 < 7)
                node[i].left = node[i * 2 + 1];
            if (i * 2 + 2 < 7)
                node[i].right = node[i * 2 + 2];
        }
      //  houxu(node[0]);
    }
    //中序遍历
    /*public static void main(String[] args)
    {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for(int i = 0; i < 10; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 10; i++)
        {
            if(i*2+1 < 10)
                node[i].left = node[i*2+1];
            if(i*2+2 < 10)
                node[i].right = node[i*2+2];
        }

        midOrderRe(node[0]);
        System.out.println();
        midOrder(node[0]);
    }*/

    //后序遍历
    /*public static void main(String[] args)
    {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for(int i = 0; i < 10; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 10; i++)
        {
            if(i*2+1 < 10)
                node[i].left = node[i*2+1];
            if(i*2+2 < 10)
                node[i].right = node[i*2+2];
        }

        postOrderRe(node[0]);
        System.out.println("***");
        postOrder(node[0]);
    }*/



}