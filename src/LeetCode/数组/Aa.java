package LeetCode.数组;

/**
 * @ClassName Aa
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/30 20:38
 */
public class Aa {
    public  int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }

    public static void main(String[] args) {
        Aa aa = new Aa();
        System.out.println(aa.getValue(2));
    }
}