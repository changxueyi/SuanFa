package 队列05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName PriorityQueue
 * @Description TODO https://www.cnblogs.com/Elliott-Su-Faith-change-our-life/p/7472265.html
 * @Author changxueyi
 * @Date 2020/5/2 14:37
 */
public class PriorityQueue {
    //Java中PriorityQueue通过二叉小顶堆实现，可以用一棵完全二叉树表示
    //优先队列的作用是能保证每次取出的元素都是队列中权值最小的
    //Java中PriorityQueue实现了Queue接口，不允许放入null元素
    //add(E e)和offer(E e)的语义相同，都是向优先队列中插入元素，只是Queue接口规定二者对插入失败时的处理不同，前者在插入失败时抛出异常
    // 后则则会返回false。对于PriorityQueue这两个方法其实没什么差别。

    //使用优先队列 PriorityQueue 来实现一个小顶堆

    //https://www.cnblogs.com/yongh/p/9945539.html
    //PriorityQueue（优先队列），一个基于优先级堆的无界优先级队列。
    //实际上是一个堆（不指定Comparator时默认为最小堆），通过传入自定义的Comparator函数可以实现大顶堆。
    //  PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); //小顶堆，默认容量为11
    //  PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>(){ //大顶堆，容量11
    //      @Override
    //      public int compare(Integer i1,Integer i2){
    //          return i2-i1;
    //      }
    //  });

    //  插入方法（offer()、poll()、remove() 、add() 方法）时间复杂度为O(log(n)) ；
    //          　　remove(Object) 和 contains(Object) 时间复杂度为O(n)；
    //         　　检索方法（peek、element 和 size）时间复杂度为常量。

}
