package LeetCode.数组;

/**
 * @ClassName MS_寻找无序数组第二小元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/27 13:53
 */
public class MS_寻找无序数组第二小元素 {
    //把数组排序。排序算法中效率最高的时间复杂度为O(nlnogn) ---不推荐使用
    //遍历历数组,找出最小的两个数字。时间复杂度为O(n)

    /**
     * 这个问题本身很简单，但是我们在处理这类问题时，需要注意这类问题的初始值和边界，
     * 对于一些极特殊情况也要尽力考虑到。
     * 比如：记录最小的两个数所用的数组初始值，使用的是整型的最大值，
     * 这样就算这个数组全都是Integer.MAX_VALUE;也能保证最后的结果是正确的。
     * 其次在遍历数组的时候，我们要确保minNum[0]保存的是最小值  nimNum[1]保存的是第二小的值。
     */
    public static int method(int [] arr){
        Integer []minNum=new Integer[2];
        minNum[0]=Integer.MAX_VALUE;//这个是Integer类中的一个int类型的常量MAX_VALUE,它代表int所能表示的最大值 0x7FFFFFFF
        minNum[1]=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(minNum[0]>arr[i]){
                minNum[1]=minNum[0];
                minNum[0]=arr[i];
            }else if(minNum[1]>arr[i]){
                minNum[1]=arr[i];
            }
        }
        return minNum[1];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,4,0,-1,-2,0};
        int a = method(arr);
        System.out.println(a);
    }
}