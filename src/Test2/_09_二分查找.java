package Test2;

/**
 * @ClassName _09_二分查找
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/5 8:42
 */
public class _09_二分查找 {
    public int search(int[] arr,int target) {
        if (arr.length==0||arr==null){
            return -1;
        }
        int first = 0;
        int last = arr.length-1;
        while (last>first){
            int mid = first+(last-first)/2;
            if (target>arr[mid]){
                first=mid+1;
            }
            else if (target<arr[mid]){
                last = mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}