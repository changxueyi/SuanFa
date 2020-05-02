package LeetCode.TOP_K;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName lc_数组中的第K个最大元素
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/2 15:24
 */
public class lc_数组中的第K个最大元素 {
    //注意： 需要找的是第K 个最大的元素，而不是第 K 个不同的元素
    //举例： [3,2,3,1,2,4,5,5,6] 和 k = 4   输出： 4

    //小顶堆 -- 放入
    //思路是创建一个小顶堆，将所有数组中的元素加入堆中，并保持堆的大小小于等于 k。
    // 这样，堆中就保留了前 k 个最大的元素。这样，堆顶的元素就是正确答案
    public int findKthLargest(int[] nums, int k) {
        //方法一：  Arrays.sort(nums);
        //        return nums[nums.length-k];
        //先对前K个数组元素进行"原地"建小顶堆，建完小顶堆后，堆顶的元素最小，正好是这K个元素的第K大元素。
        Queue<Integer> heap = new PriorityQueue<>((v1, v2) -> v1 - v2);

        //这个位置的代码太令人amazing了,
        for (int n : nums) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.poll();
    }
}