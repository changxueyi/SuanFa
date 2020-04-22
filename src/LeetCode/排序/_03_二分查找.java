package LeetCode.排序;

/**
 * @ClassName _03_二分查找
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/3 20:28
 */
public class _03_二分查找 {
    //递归,解决二分查找
    public static int recursionBinarySearch(int[] arrays, int target, int low, int high) {
        if (target < arrays[low] || target > arrays[high] || low > high) {
            return -1;
        }
        int middle = (low + high) / 2;//初始化中间位置的值
        if (arrays[middle] > target) {
            return recursionBinarySearch(arrays, target, low, middle - 1);
        } else if (arrays[middle] < target) {
            return recursionBinarySearch(arrays, target, middle + 1, high);
        } else {
            return middle;
        }
    }

    //14点19分 2020/3/15
    public int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arrays = {1, 6, 10, 11, 12, 100};
        for (int i = 0; i < 10; i++) {
            int sign = recursionBinarySearch(arrays, i, 0, arrays.length - 1);
            if (sign == -1) {
                System.out.println("在数组中找不到" + i + "这个元素");
                System.out.println("目标元素" + i + "在数组的第" + sign + "位置");
            }
            sign = -1;
        }
    }
}