package 栈04;

/**
 * @ClassName Main
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/13 22:44
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i =0;i<5;i++){
            stack.push(i);
            System.out.println(stack);
        }
        System.out.println("size："+stack.getSize());
        System.out.println(stack);

    }
}