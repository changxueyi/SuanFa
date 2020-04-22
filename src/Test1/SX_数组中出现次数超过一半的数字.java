package Test1;

/**
 * @ClassName SX_数组中出现次数超过一半的数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 15:10
 */
public class SX_数组中出现次数超过一半的数字 {
    public int fun01(int[] arr) {
        int target = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (target==arr[i])
                count++;
            else
                count--;
            if (count==0){
                target = arr[i];
                count=1;
            }
        }
        return target;
    }
}