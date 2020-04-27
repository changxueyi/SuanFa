package Test3;

import java.util.ArrayList;

/**
 * @ClassName SX_11_62圆圈中最后剩下的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/24 16:41
 */
public class SX_11_62圆圈中最后剩下的数字 {
    public static int fun(int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        //第一次删除的是cur = （m-1）个，下次删除的是cur = （m-1）+m,第三次
        // 当前是cur  下次删除的就是cur + m  ，总的来说就是 cur + m − 1
        // 0 , 3, 5
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        //初始化删除的就是0；
        int cur = 0;
        while (n > 1) {
            //0 1 3 4
            cur = (cur + m - 1) % n;
            arr.remove(cur);
            n--;
        }
        return arr.get(0);
    }

    //约瑟夫环问题
    // 设第一次删除的为0 ，第二次为m，第三次呢，cur+m-1

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = fun(a, b);
        System.out.println(c);
    }
}