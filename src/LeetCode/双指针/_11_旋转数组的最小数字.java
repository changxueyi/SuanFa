package LeetCode.双指针;

import javax.xml.bind.annotation.XmlID;

/**
 * @ClassName _11_旋转数组的最小数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/21 20:28
 */
public class _11_旋转数组的最小数字 {
    /**
     * 循环二分： 设置 ii, jj 指针分别指向 numbers 数组左右两端，m = (i + 2) // 2m=(i+2)//2 为每次二分的中点（向下取整，因此恒有 i <= m < ji<=m<j ），可分为以下三种情况：
     * 当 numbers[m] > numbers[j]时： mm 一定在 左排序数组 中，即旋转点 xx 一定在 [m+1,j][m+1,j] 闭区间内，因此执行 i = m + 1i=m+1；
     * 当 numbers[m] < numbers[j] 时： mm 一定在 右排序数组 中，即旋转点 xx 一定在[i,m][i,m] 闭区间内，因此执行 j = mj=m；
     * 当 numbers[m] == numbers[j] 时： 无法判断 mm 在哪个排序数组中，因此无法判断旋转点 xx 在 [i, m][i,m] 还是 [m+1,j][m+1,j] 区间中，结论是执行 j = j - 1j=j−1 缩小判断范围 （分析见以下内容） 。
     * 返回值： 当 i = ji=j 时跳出二分循环，并返回 numbers[i] 即可。
     * @param numbers
     * @return
     */
    //正确答案
    public int minArray(int[] numbers) {
        int low = 0 ; int high = numbers.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(numbers[mid] > numbers[high]){
                low = mid + 1;
            }else if(numbers[mid] == numbers[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return numbers[low];
    }



    //方法超时，不正确
    public int minArray1(int[] numbers) {
        int left = 0;
        int right = numbers.length-1;
        int mid =0;
        while (numbers[left]>numbers[right]){
            mid = (left+right)/2;
            if (numbers[left]>  numbers[mid]){
                left=mid;
            }
            if (numbers[left]<numbers[mid]){
                right=mid;
            }
            if (right-left==1){
                mid = right;
                return mid;
            }
        }
        return numbers[mid];
    }
}