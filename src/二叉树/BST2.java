package 二叉树;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @ClassName BST2
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/17 15:28
 */
public class BST2<E extends Comparable<E>> {
    private class Node {
        private E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    //定义一个构造函数
    public BST2() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //向二分搜索树中添加一个新的元素
    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        //如果添加的元素不为空的话
        if (e.compareTo(node.e) < 0) {
            //如果e比根节点，node.e 此时就是个根节点,如果比他小的话
            node.left = add(node.left, e);
            //如果比根小的话，直接根节点的左子树，直接和根节点的左子树进行比较
        } else if (e.compareTo(node.e) > 0) {
            //继续调用这个函数，传入node 为根节点的右节点
            node.right = add(node.right, e);
        }
        //如果比节点相同的话，直接返回这个节点的根节点
        return node;
    }

    //看是否包含这个元素
    public boolean contains(E e) {
        //传入一个节点，判断时候包含这个元素
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        //判断传来的node是否为空
        if (node == null)
            return false;
        if (e.compareTo(node.e) == 0)
            return true;
        else if (e.compareTo(node.e) < 0)
            return contains(node.left, e);
        else //(e.compareTo(node.e)>0)
            return contains(node.right, e);
    }

    //二分搜索树的前序遍历
    public void preOrder() {
        preOrder(root);
    }

    //前序遍历以node为根的二分搜索树,递归算法
    private void preOrder(Node node) {
        //传入一个node ，node,相当于一个树直接传过来了
        if (node == null)
            return;
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    //前序遍历的非递归实现
    public void preOrderNR(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            //先打印这个元素
            System.out.println(cur.e);
            //如果左子树不为空的话，直接让左子树入栈，右子树不为空，让右子树入栈
            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }
    }

    //二分搜索树的中序遍历
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    //二分搜索树的后序遍历，递归实现
    private void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    //二分搜索树的层序遍历,递归实现
    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.remove();
            System.out.println(cur.e);

            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);
        }
    }

    //查找最小的元素
    public E minimum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!");
        }
        return minimum(root).e;
    }

    private Node minimum(Node node) {
        if (node.left == null)
            return node;
        return minimum(node.left);
    }

    //寻找二分搜索树的最大元素
    public E maximum() {
        if (size == 0)
            throw new IllegalArgumentException("BST is empty");
        return maximum(root).e;
    }

    private Node maximum(Node node) {
        if (node.right == null)
            return node;
        return maximum(node.right);
    }

    //从二分搜索树中删除最小值所在的节点,返回最小值
    public E removemin() {
        E ret = minimum();
        root = removemin(root);
        return ret;
    }

    private Node removemin(Node node) {
        //删除最小的节点
        //如果最小的节点左子树为空的话，直接删除根节点,直接让根节点为空,size--,返回现在的根节点也就是右节点）
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removemin(node.left);
        return node;
    }

    //从二分搜索树中删除最大值所在的节点，返回最大值
    public E removeMax() {
        E ret = maximum();
        root = removeMax(root);
        return ret;
    }

    //删除掉以node 为根的二分搜索树中俄最大的节点
    private Node removeMax(Node node) {

        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }

        node.right = removeMax(node.right);
        return node;
    }

    //删除掉以node为根的二分搜索树中值为 e 的节点,递归算法
    public void remove(E e) {
        root = remove(root, e);
    }

    ////////////////////////////////////////////
    /////////////////待完善///////////////////////////
    private Node remove(Node node, E e) {
        return root;
    }


}