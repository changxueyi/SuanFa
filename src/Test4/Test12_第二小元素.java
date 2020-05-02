package Test4;

/**
 * @ClassName Test12_第二小元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/29 21:58
 */
public class Test12_第二小元素 {
    public static int fun(int[] arr) {
        if (arr == null) return -1;

        Integer[] cur = new Integer[2];
        cur[0] = Integer.MAX_VALUE;
        cur[1] = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < cur[0]) {
                cur[1] = cur[0];
                cur[0] = arr[i];
            } else if (arr[i] < cur[1]) {
                cur[1] = arr[i];
            }
        }
        return cur[1];
    }

    public static void main(String[] args) {
        int[] arr = {0, -1,-12, -100, 1, 1, 3, 4, 5, 6};
        int maxTwo = fun(arr);
        System.out.println(maxTwo);
    }
}