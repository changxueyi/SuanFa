package Test2;


import java.util.ArrayList;

/**
 * @ClassName _15_中序遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/6 16:24
 */
public class _15_中序遍历 {
    public ArrayList<Integer> zhongxu(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        dfs(arrayList, root);
        return arrayList;
    }

    void dfs(ArrayList<Integer> arrayList, TreeNode root) {
        if (root == null) return;
        dfs(arrayList, root.left);
        arrayList.add(root.val);
        dfs(arrayList, root.right);
    }
}