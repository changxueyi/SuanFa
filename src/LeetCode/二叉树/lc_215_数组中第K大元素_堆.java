package LeetCode.二叉树;

/**
 * @ClassName lc_215_数组中第K大元素_堆   参考：https://www.cnblogs.com/kyoner/p/10465633.html
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/27 14:36
 */
public class lc_215_数组中第K大元素_堆 {
    // 维持一个小顶堆，小顶堆的特点是每一个父节点都小于等于自己的两个子节点
    //维护一个容量为K的小顶堆，堆中的K个节点代表着当前最大的K个元素，而堆顶显然是这K个元素中的最小值
    //遍历原数组，每遍历一个元素，就和堆顶比较，如果当前元素小于等于堆顶，则继续遍历;如果元素大于堆顶，则把当前元素放在堆顶位置，并调整二叉堆（下沉操作）。
    //遍历结束后，堆顶就是数组的最大K个元素中的最小值，也就是第K大元素。
    //*****相关分析*******
    //1.构建堆的时间复杂度是O(K)
    //2.遍历剩余数组的时间复杂度O(n-K)
    //3.每次调整堆的时间复杂度是O(logk)
    //其中2和3是嵌套关系，1和2,3是并列关系，所以总的最坏时间复杂度是O((n-k)logk + k)。当k远小于n的情况下，也可以近似地认为是O(nlogk)。
    //这个方法的空间复杂度是多少呢？
    //刚才我们在详细步骤中把二叉堆单独拿出来演示，是为了便于理解。但如果允许改变原数组的话，我们可以把数组的前K个元素“原地交换”来构建成二叉堆，这样就免去了开辟额外的存储空间。因此空间复杂度是O(1)。

    /**
     * 寻找第k大元素
     *
     * @param array 待调整的数组
     * @param k     第几大
     * @return
     */
    public static int findNumberK(int[] array, int k) {
        //1.用前k个元素构建小顶堆
        buildHeap(array, k);
        //2.继续遍历数组，和堆顶比较
        for (int i = k; i < array.length; i++) {
            if(array[i] > array[0]) {
                array[0] = array[i];
                downAdjust(array, 0, k);
            }
        }
        //3.返回堆顶元素
        return array[0];
    }
    //构建小顶堆
    private static void buildHeap(int[] array, int length) {
        //从最后一个非叶子节点开始，依次下沉调整
        for (int i = (length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, length);
        }
    }
    /**
     * 下沉调整
     * @param array 待调整的堆
     * @param index 要下沉的节点
     * @param length 堆的有效大小
     */
    private static void downAdjust(int[] array, int index, int length) {
        //temp保存父节点的值，用于最后的赋值
        int temp = array[index];
        int childIndex = 2 * index + 1;
        while (childIndex < length) {
            //如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            //如果父节点小于任何一个孩子的值，直接跳出
            if (temp <= array[childIndex])
                break;
            //无需真正交换，单项赋值即可
            array[index] = array[childIndex];
            index = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[index] = temp;
    }



    public static void main(String[] args) {
        int[] array = new int[] {7, 5, 15, 3, 17, 2, 20, 24, 1, 9, 12, 8};
        System.out.println(findNumberK(array, 5));
    }



}