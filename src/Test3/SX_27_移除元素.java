package Test3;

/**
 * @ClassName SX_27_移除元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/25 10:25
 */
public class SX_27_移除元素 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 || nums == null) return -1;
        int a = 0;
        for (int num : nums) {
            if (num != val) {
                nums[a] = num;
                a++;
            }
        }
        return a;
    }

    //方法二： 移换相减
    public static int fun(int[] nums, int val) {
        if (nums.length == 0 || nums == null) return -1;
        int a = nums.length;
        for (int i = 0; i < a;) {
            if (nums[i] == val){
                nums[i] = nums[a-1];
                a--;
            }
            else {
                i++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,3,4};
        int a = fun(arr,3);
        System.out.println(a);
    }
}