package 链表03;

/**
 * @ClassName LinkList3
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/12 17:12
 */
public class LinkedList3<E> {


    public class Node {
        public E e;
        public Node next;

        public Node(E e) {
            this.e = e;
        }

        public Node(Node next, E e) {
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

    //头节点初始化
    public LinkedList3() {
        dummyhead = new Node(null,null);
        size = 0;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //在链表头添加新的元素e
    public void addFirst(E e) {
       add(0,e);
        size++;
    }

    //在链表增加一个元素，
    public void add(int index, E element) {
        if (index <= 0 || index > size) {
            throw new IllegalArgumentException("输入的有误");
        } else {
            Node prev = dummyhead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            Node node = new Node(element);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    //在链表的末尾添加一个元素
    public void addLast(E e) {
        add(size, e);
        size++;
    }
}