package Test2;

import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;

/**
 * @ClassName Test01
 * @Description 求1+2+3+4+。。。。。。。。。。+n
 * @Author changxueyi
 * @Date 2020/4/2 20:20
 */
public class Test01 {
    public static int fun(int n) {
        if (n <= 1)
            return n;
        return n+ fun(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Test01.fun(3));
    }
}