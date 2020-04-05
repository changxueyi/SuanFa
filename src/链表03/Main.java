package 链表03;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/12 21:06
 */
public class Main {
    public static void main(String[] args) {
        LinkedList2<Integer> linkedList2 = new LinkedList2<>();
        for (int i = 0;i<5;i++){
            linkedList2.addFirst(i);
            System.out.println(linkedList2);
        }
        linkedList2.add(2,666);
        linkedList2.delete(0);
        System.out.println(linkedList2);
    }
}