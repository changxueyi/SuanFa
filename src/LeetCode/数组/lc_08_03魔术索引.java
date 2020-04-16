package LeetCode.数组;

/**
 * @ClassName lc_08_03魔术索引
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/15 15:28
 */
public class lc_08_03魔术索引 {
    public static int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (a == i) {
                return a;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 4};
        int b = findMagicIndex(arr);
        System.out.println(b);
    }

}