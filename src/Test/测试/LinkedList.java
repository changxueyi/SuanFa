package Test.测试;



/**
 * @ClassName LinkList
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/11 20:44
 */
public class LinkedList<E> {
    //私人
    private class Node {
        public E e;
        public Node next;

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

        @Override
        public String toString() {
            return e.toString();
        }
    }

    //整个链表有一个特殊的节点head
    private Node head;
    int size;
    //链表 构造函数，头节点未空  ，大小未0；
    public LinkedList(){
        head=null;
        size = 0;
    }

    //获取链表的个数

    public int getSize(){
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //在链表头添加新的元素e
    public void addFirst(E e){
        Node node = new Node(e);
        node.next = head;
        head=node;

        size++;
    }

    //在链表的index 位置添加新的元素e
    //在链表中不是常用的操作，练习用
    public void add(int index , E e){
        if (index<0||index>size){
            throw new IllegalArgumentException("add failed");
        }
        if(index==0)
            addFirst(e);
        else {
            Node prev = head;
            for (int i = 0;i < index-1;i++){
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next=prev.next;
            prev.next=node;
            size++;
        }
    }


}