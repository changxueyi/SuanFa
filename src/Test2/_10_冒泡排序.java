package Test2;

/**
 * @ClassName _10_冒泡排序
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 8:57
 */
public class _10_冒泡排序 {
    public void maopao(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}