package Test1;

/**
 * @ClassName SX_快速排序
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 16:16
 */
public class SX_快速排序 {
    //对arr[L,R] 进行快速排序
   static void QuikSort(int arry[], int L, int R) {
        if (L > R)
            return;
        int left = L;
        int right = R;
        int pivot = arry[left];
        while (left < right) {
            while (right > left && arry[right] >= pivot) {
                right--;
            }
            if (right > left)
                arry[left] = arry[right];

            while (right > left && arry[left] <= pivot) {
                left++;
            }
            if (right > left)
                arry[right] = arry[left];

            if (left >= right)
                arry[left] = pivot;
        }
        QuikSort(arry,L,right-1);
        QuikSort(arry,right +1,R);

    }

    public static void main(String[] args) {
            int[] arr = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
            QuikSort(arr, 0, arr.length - 1);
            System.out.println("排序后:");
            for (int i : arr) {
                System.out.println(i);
            }
        }



}