package Test.测试;

/**
 * @ClassName FastSort 快速排序，第一次弄得这么熟悉
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/24 21:27
 */
public class FastSort {
    static void QuickSort(int arr[], int L, int R) {
        if (L >= R)
            return;
        int left = L;
        int right = R;
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
            }
            if (left >= right) {
                arr[left] = pivot;
            }
        }
        QuickSort(arr, L, left - 1);//QuickSort(arr, L, right-1) 也正确
        QuickSort(arr, left + 1, R);//QuickSort(arr, left+1,R)
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        QuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}