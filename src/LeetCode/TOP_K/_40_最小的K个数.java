package LeetCode.TOP_K;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName _40_最小的K个数
 * @Description TODO https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/solution/3chong-jie-fa-miao-sha-topkkuai-pai-dui-er-cha-sou/#%E4%BA%8C%E3%80%81%E5%A4%A7%E6%A0%B9%E5%A0%86%E5%89%8D-k-%E5%B0%8F-/-%E5%B0%8F%E6%A0%B9%E5%A0%86%EF%BC%88%E5%89%8D-k-%E5%A4%A7,java%E4%B8%AD%E6%9C%89%E7%8E%B0%E6%88%90%E7%9A%84-priorityqueue%EF%BC%8C%E5%AE%9E%E7%8E%B0%E8%B5%B7%E6%9D%A5%E6%9C%80%E7%AE%80%E5%8D%95%EF%BC%9A
 * @Author changxueyi
 * @Date 2020/5/2 14:56
 */
public class _40_最小的K个数 {


    // 大根堆(前 K 小) / 小根堆（前 K 大),Java中有现成的 PriorityQueue，实现起来最简单：O(NlogK)O(NlogK)
    //本题是求前 K 小，因此用一个容量为 K 的大根堆，每次 poll 出最大的数，那堆中保留的就是前 K 小啦（注意不是小根堆！小根堆的话需要把全部的元素都入堆，那是 O(NlogN)O(NlogN)😂，就不是 O(NlogK)O(NlogK)啦～

    /**
     * 保持堆的大小为K，然后遍历数组中的数字，遍历的时候做如下判断：
     * // 1. 若目前堆的大小小于K，将当前数字放入堆中。
     * // 2. 否则判断当前数字与大根堆堆顶元素的大小关系，如果当前数字比大根堆堆顶还大，这个数就直接跳过；
     * //    反之如果当前数字比大根堆堆顶小，先poll掉堆顶，再将该数字放入堆中
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        //默认是小根堆,实现大根堆需要重写一些比较器
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : arr) {
            if (pq.size() < k) {
                pq.offer(num);
                //如果大顶堆堆顶元素大于给定值的话
            } else if (num < pq.peek()) {
                //将首个元素从堆顶弹出去(最大的那个元素）
                pq.poll();
                //将元素插入进来
                pq.offer(num);
            }
        }

        //将堆中最小的K个元素返回
        int[] res = new int[pq.size()];
        int idx = 0;
        for (int num : pq) {
            res[idx++] = num;
        }
        return res;
    }

    //15点12分 使用小顶堆解决最小的K个数
    //分析： 建立最小的K顶堆
    // 1.如果堆中的元素小于K ，直接扔进堆中
    // 2.如果堆中的元素 为 K了，开始进行比较
    // 3.取堆顶元素-*-------此处有问题，需要一个一个插入，效率极其的底下


}