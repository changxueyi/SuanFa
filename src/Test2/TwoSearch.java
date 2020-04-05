package Test2;

/**
 * @ClassName TwoSearch
 * @Description 二分查找
 * @Author changxueyi
 * @Date 2020/4/2 21:25
 */
public class TwoSearch {
    public int search(int[] arr, int mu) {
        int first = arr[0];
        int last = arr[arr.length - 1];
        while (first != last) {
            int mid = first + (last - first) / 2;
            if (mu > mid) {
                first = mid + 1;
            } else if (mu < mid) {
                last = mid - 1;
            } else {
                System.out.println("已找到");
                return mid;
            }
        }
        System.out.println("未找到");
        return -1;
    }

    public static void main(String[] args) {
        int arr[];
        arr = new int[]{1, 4, 56, 75, 676466, 7};
        TwoSearch twoSearch = new TwoSearch();
        int a = twoSearch.search(arr,4);
        System.out.println(a);
    }

}