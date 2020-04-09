package 并发泛型反射.JAVA8;

/**
 * @ClassName program
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/8 21:05
 */
public class program {
    public static void main(String[] args) {
        FirstInterface a   = new FirstInterfaceImpl();
        a.get();
        FirstInterfaceImpl b = new FirstInterfaceImpl();
        b.get();
        System.out.println("***************************");
        // new 接口去实现接口，就是匿名内部类
        FirstInterface c = new FirstInterface() {
            @Override
            public void get() {
                System.out.println("常学奕");
            }
        };
        c.get();
        System.out.println("*************");
        FirstInterface d = ()->{
            System.out.println("李艳茹");
        };
        d.get();
        System.out.println("无返回值，单个参数");
        NoOne e = (int aa) ->{
            System.out.println(aa);
        };
        e.get(10);
        System.out.println("无返回值，多个参数的");
        NoTwo f = (int aa,int bb)->{
            System.out.println(aa+bb);
        };
        f.get(1,2);
        System.out.println("无参有返回值的");
        IntNo g = ()->{
            System.out.println("1111111111111111");
            return 100;
        };
        int res = g.get();
        System.out.println(res);
        System.out.println("有返回值，单个参数的");
        IntOne h = (int aa)->{
            return aa*2;
        };
        int pre = h.get(10);
        System.out.println(pre);
        System.out.println("有参，多个参数");
        IntTwo q = (int aa,int bb)->{
            return aa+bb;
        };
        int cur  = q.get(10,20);
        System.out.println(cur);
    }
}
