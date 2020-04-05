package 链表03;

/**
 * @ClassName LinkedList
 * @Description 根据小码哥，自己写的链表
 * @Author changxueyi
 * @Date 2020/2/12 14:35
 */
public class LinkedList<E> implements List{
    //进行初始化
    private int size;
    private Node<E> first;
    public static final int ELEMENT_NOT_FOUND = -1;
    public static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

    }




    /**
     * 清除所有元素
     */
    @Override
    public void clear() {
        size=0;
        first=null;
    }

    /**
     * 元素的数量
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 是否为空
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (size==0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 是否包含某个元素
     *
     * @param element
     * @return
     */
    @Override
    public boolean contains(Object element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /**
     * 添加元素到尾部
     *
     * @param element
     */
    @Override
    public void add(Object element) {
        add(size,element);
    }

    /**
     * 获取index位置的元素
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        return node(index).element;
    }

    /**
     * 设置index位置的元素
     *
     * @param index
     * @param element
     * @return 原来的元素ֵ
     */
    @Override
    public Object set(int index, Object element) {
        Node<E> node = node(index);
        E old = node.element;
        node.element = (E) element;
        return old;
    }

    /**
     * 在index位置插入一个元素
     *
     * @param index
     * @param element
     */
    @Override
    public void add(int index, Object element) {

    }

    /**
     * 删除index位置的元素
     *
     * @param index
     * @return
     */
    @Override
    public Object remove(int index) {
        return null;
    }

    /**
     * 查看元素的索引
     *
     * @param element
     * @return
     */
    @Override
    public int indexOf(Object element) {
        return 0;
    }
    /**
     *  获取index位置对应的节点对象
     */
    public Node<E> node(int index){
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i<index;i++){
            node= node.next;
        }
        return node;

    }
    /**
     * 判断传来的index是否是有问题的
     * @param index
     */
    protected void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
    }

    protected void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }
}