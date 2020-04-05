package 队列05;

import java.util.Objects;

/**
 * @ClassName LoopQueue
 * @Description 循环队列
 * @Author changxueyi
 * @Date 2020/2/17 15:58
 */
public class LoopQueue<E> implements Queue<E>{
    private E[] data;
    private int front,tail;
    private int size;
    public LoopQueue (int capacity){
        //容量是capacity，有多少元素就放多少的size
        data =(E[]) new Objects[capacity+1];
        front = 0;
        tail = 0;
        size=0;
    }
    public LoopQueue(){
        this(10);
    }
    public int getCapacity(){
        return data.length-1;
    }
    //判断循环队列是否为空
    @Override
    public boolean isEmpty(){
        return front==tail;
    }
    @Override
    public int getSize(){
        return size;
    }

    //


    @Override
    public void enqueue(E e) {
        if ((tail+1)%data.length==front)
            resize(getCapacity()*2);
    }

    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity+1];
        for (int i=0;i<size;i++) {
            newData[i] = data[(i + front) % data.length];
            data = newData;
            front = 0;
            tail = size;
        }
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}