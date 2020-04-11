package Test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName _21_前序遍历
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/10 20:34
 */
public class _21_前序遍历 {
    public List<Integer> qianxu(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        dfs(root, arrayList);
        return arrayList;
    }

    void dfs(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) return;
        arrayList.add(root.val);
        dfs(root.left, arrayList);
        dfs(root.right, arrayList);
    }

    // 前序遍历
    public ArrayList<Integer> qianxu02(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.add(p);
                result.add(p.val);
                p = p.left;
            } else {
                TreeNode t = stack.pop();
                p = t.right;
            }
        }
        return result;
    }

    //中序遍历
    public ArrayList<Integer> zhongxu(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.add(p);
                p = p.left;
            } else {
                TreeNode t = stack.pop();
                result.add(t.val);
                p = p.right;
            }
        }
        return result;
    }


    //后续遍历
   /* public ArrayList<Integer> houxu(TreeNode root) {
        return
    }*/

}