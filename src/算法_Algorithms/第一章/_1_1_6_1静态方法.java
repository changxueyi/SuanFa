package 算法_Algorithms.第一章;

import java.util.Arrays;

/**
 * @ClassName _1_1_6_1静态方法
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/21 21:42
 */
public class _1_1_6_1静态方法 {
    //判断一个数是否是素数
    //https://blog.csdn.net/afei__/article/details/80638460?depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-1&utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-1
    public boolean fun(int target) {
        if (target < 2) return false;
        // for (int i = 0; i < )
        return true;
    }

    public static int fun01(int key, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (key > arr[mid])
                left = mid + 1;
            else if (key < arr[mid])
                right = mid - 1;
            else
                //返回的是这个数字的索引
                return mid;
        }
        return -1;

    }


    public static void main(String[] args) {
        //使用数组去
        int cur[] = {0, 2, 5, 8, 34, 99};
        int a = fun01(1, cur);

        System.out.println(a);

        //自己输入数字，打印，进行排序
    }
}