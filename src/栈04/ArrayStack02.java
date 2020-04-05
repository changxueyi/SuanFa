package 栈04;



/**
 * @ClassName ArrayStack02
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/12 21:22
 */
public class ArrayStack02 {
    //定义一个数组
    private String[] items;
    //栈中元素的个数
    private int count;
    //栈的大小
    private int n;

    //初始化数组,申请一个大小为n的数组空间
    public ArrayStack02(int n){
        this.items = new String[n];
        this.n=n;
        this.count=0;
    }

    //入栈操作，
    public boolean push(String item){
        //数组空间不够了，直接返回false,入栈失败
        if (count==n)return false;
        //将item放到下标为count 的位置,并且count 加1
        items[count] = item;
        ++count;
        return true;
    }
}