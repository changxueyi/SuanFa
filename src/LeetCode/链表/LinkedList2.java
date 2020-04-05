package LeetCode.链表;

/**
 * @ClassName LinkedList2
 * @Description 根据慕课网Bobo的链表看视频的写法
 * @Author changxueyi
 * @Date 2020/2/12 16:47
 */
public class LinkedList2<E> {
    private class Node {
        public E e;
        public Node next;

        //用户传来的e，和用户传来的next
        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        //把这个节点打印出来
        @Override
        public String toString() {
            return e.toString();
        }

    }

    //声明头节点
    private Node dummyHead;
    private int size;

    public LinkedList2() {
        /* head = null;*/
        dummyHead = new Node(null, null);
        size = 0;
    }

    //获取链表中的元素个数
    public int getSize() {
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //在链表头添加新的元素e
    public void addFirst(E e) {
        add(0, e);
    }

    //在链表中间添加一个元素
    //关键：要找到添加这个节点的前一个结点
    //在链表的index（0-based）位置添加新的元素e
    public void add(int index, E e) {
        //判断index的合法性,index可以取最后一个元素
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("超出范围了");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;
        size++;

    }

    //在元素末尾直接添加一个元素
    public void addLast(E e) {
        add(size, e);
    }


    //获得链表的第index（0-based）个位置的元素
    //在链表中不是一个常用的操作，练习用
    public E get(int index) {
        if (index <= 0 || index >= size) {
            throw new IllegalArgumentException("超出范围了");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    //获得链表的第一个元素
    public E getFirst(){
        return  get(0);
    }

    //获得链表的最后一个元素
    public E getLast(){
        return  get(size-1);
    }

    //修改链表的第index个位置的元素为e
    public void set(int index, E e) {
        if (index <= 0 || index >= size) {
            throw new IllegalArgumentException("超出范围了");
        }
        Node cur = dummyHead.next;
        for (int i = 0;i<index;i++){
            cur = cur.next;
        }
        cur.e = e;
    }

    //查找链表中是否存在元素e
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            } else {
                cur = cur.next;
            }
        }
        return false;
    }

    //删除index位置的元素
    public void delete(int index){
        if (index<0 || index>=size){
            throw new IllegalArgumentException("你输入的有误");
        }
        Node prev = dummyHead;
        for (int i =0;i<index;i++){
            prev = prev.next;
        }
        Node deleteNode =prev.next;
        prev.next=deleteNode.next;
        deleteNode.next=null;
        size--;
    }
    public void deleteFirst(){
        delete(0);
    }
    public void deleteLast(){
        delete(size-1);
    }


    /**
     * 重写toString
     * @return
     */
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur!=null){
            res.append(cur+"-->");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }

}