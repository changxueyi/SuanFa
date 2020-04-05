package Test.链表;


import 链表03.LinkedList3;

/**
 * @ClassName LinkedList
 * @Description 自己写的LinkedList
 * @Author changxueyi
 * @Date 2020/2/13 16:40
 */
public class LinkedList<E> {
    //进行初始化,构建结点
    public class Node {
        public E e;
        public Node next;

        public Node(E e) {
            this.e = e;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node() {
            this(null, null);
        }
    }

    //创建一个头节点
    private Node dummyhead;
    private int size;

    public LinkedList() {
        dummyhead = new Node(null, null);
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //在链表头添加新的元素e
    //在链表头添加新的元素e
    public void addFirst(E e) {
        add(0, e);
        size++;
    }

    //在链表增加一个元素
    public void add(int index, E element) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("你输入的有误");

        Node prev = dummyhead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = new Node(element);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    //在链表的末尾添加一个元素
    public void addLast(E e) {
        add(size, e);
        size++;
    }

    //获得第index位置元素
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("你输入的有误");
        Node cur = dummyhead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    //获得链表的最后一个元素
    public E getLast(int index) {
        return get(size - 1);
    }

    //查找链表中是否有元素e
    public boolean contains(E e) {
        Node cur = dummyhead.next;
        while (cur != null) {
            if (cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString(){
       StringBuilder res = new StringBuilder();
       Node cur = dummyhead.next;
       res.append("size").append(size).append(",[");
       while (cur!=null){
           res.append(cur+"-->");
       }
       res.append("null");
       return res.toString();

    }
}