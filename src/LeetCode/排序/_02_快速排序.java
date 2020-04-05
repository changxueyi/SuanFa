package LeetCode.排序;

/**
 * @ClassName _02_快速排序
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/23 20:28
 */
public class _02_快速排序 {
    //1.选定pivot中心
    //2.将大于pivot的数字放在pivot的右边
    //3.将小于放左边
    //4.重复以上操作
    static void QuikSort(int arry[], int L, int R) {
        if (L >= R)
            return;
        int left = L, right = R;
        int pivot = arry[left];
        while (left < right) {
            while (left < right && arry[right] >= pivot) {
                right--;
            }
            if (left < right) {
                arry[left] = arry[right];
            }
            while (left < right && arry[left] <= pivot) {
                left++;
            }
            if (left < right) {
                arry[right] = arry[left];
            }
            if (left >= right) {
                arry[left] = pivot;
            }
        }
        QuikSort(arry, L, right - 1);
        QuikSort(arry, right + 1, R);
    }


    //13点46分 2020/3/15 再战快速排序
    static void Quicksort(int arr[], int L, int R) {
        if (L > R) {
            return;
        }
        int left = L, right = R;
        int pivot = arr[left];
        while (left < right) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            if (left < right) {
                arr[left] = arr[right];
            }
            while (left < right && arr[left] < pivot) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
            }
            if (left >= right) {
                arr[left] = pivot;
            }
        }
        QuikSort(arr, L, left - 1);
        QuikSort(arr, left + 1, R);
    }

    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        Quicksort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        for (int i : arr) {
            System.out.println(i);
        }
    }

}