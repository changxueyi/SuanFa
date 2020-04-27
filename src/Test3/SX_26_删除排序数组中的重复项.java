package Test3;

/**
 * @ClassName SX_26_删除排序数组中的重复项
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/25 10:55
 */
public class SX_26_删除排序数组中的重复项 {
    public  static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) return -1;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,4};
        int a = removeDuplicates(arr);
        System.out.println(a);
    }
}