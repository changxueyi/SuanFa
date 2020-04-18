package LeetCode.递归;

/**
 * @ClassName Hanota汉诺塔
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/18 15:52
 */
public class Hanota汉诺塔 {
    //将n个圆盘从A 柱子，放C柱子
    //分两种情况讨论
    // 第一种情况. 当n==1时候，直接将盘子从A 移动到 C柱子
    // 第二种情况，当N>1时候，可以拆分位三大步骤
    //1.将n-1个盘子从A移动到 B
    //2. 将编号为 n 的盘子从A 移动到 C
    //3. 将n-1个盘子从B 移动到 C
    // 1、3 是一个递归


    //***** 时间复杂度：O（2的n次方） 空间复杂度：o（n）
    public static void hanoi(int n, String p1, String p2, String p3) {
        if (n == 1) {
            move(1, p1, p3);
            //一定要记得 return
            return;
        }
        //p1,是起点，p2，是终点，将n-1个盘子从P1 放 p2
        hanoi(n - 1, p1, p3, p2);
        move(n, p1, p3);
        hanoi(n - 1, p2, p1, p3);
    }

    /**
     * 将"+no+"号盘子从"+from+"移动到"+to
     *
     * @param no
     * @param from
     * @param to
     * @return void
     */
    static void move(int no, String from, String to) {
        System.out.println("将" + no + "号盘子从" + from + "移动到" + to);
    }

    public static void main(String[] args) {
        Hanota汉诺塔.hanoi(2, "A", "B", "C");
    }


}