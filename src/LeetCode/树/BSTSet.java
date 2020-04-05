package LeetCode.树;

/**
 * @ClassName BSTSet
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/4 21:25
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {
    private BST<E> bst;
    public BSTSet(){
        bst=new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}