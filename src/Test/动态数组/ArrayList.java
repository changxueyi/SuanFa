package Test.动态数组;

/**
 * @ClassName ArrayList
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/13 15:46
 */
public class ArrayList<E> {

    private int size;
    private static final int DEFAULT_ELEMENT = 10;
    private static final int ELEMENT_NOT_FOUND = -1;
    //定义一个数组
    E[] elements;

    public ArrayList(int capaticy) {
        if (DEFAULT_ELEMENT >= capaticy) {
            capaticy = DEFAULT_ELEMENT;
        } else {
            capaticy = capaticy;
        }
        elements = (E[]) new Object[capaticy];
    }

    public ArrayList() {
        this(DEFAULT_ELEMENT);
    }

    //元素的数量
    public int count() {
        return size;
    }

    //是否为空
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //是否包含该元素,返回true or false
    public boolean contains(E element) {
        return indexOf(element)!=ELEMENT_NOT_FOUND;
    }

    //增加一个元素
    public void add(E element) {

    }

    //返回index对应的元素
    public E get(int index) {
        rangeCheck(index);
        return elements[index];
    }

    //设置index位置上的元素
    public void set(int index, E element) {
        rangeCheck(index);
        elements[index] = element;

    }

    //向index位置上添加元素
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        ensureCapacity(size + 1);
        for (int i = index; i < size; i++) {
            elements[size] = elements[size - 1];
        }
        elements[index] = element;
        size++;
    }


    //删除index上的元素
    public void remove(int index) {
        rangeCheck(index);
        for (int i = index; i < size - 1; i++) {
            elements[index] = elements[index + 1];
        }
        size--;
        elements[size] = null;
    }

    //看下这个位置的索引,找到返回索引，找不到返回-1
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {
                    return i;
                }
            }}
            return ELEMENT_NOT_FOUND;


    }

    //清除所有的元素
    public void clear(){
        for (int i =0;i<size;i++){
            elements[i] =null;
        }
    }
    //index异常判断
    public void rangeCheck(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("您输入的有误");
    }

    public void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("亲，您输入的有误");
        }
    }

    //扩容
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= capacity) return;
        else {
            //新容量为久容量的1.5倍
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            //把老容量的都往新容量移动
            E[] newElements = (E[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
            System.out.println(oldCapacity + "扩容为" + newCapacity);
        }
    }
    //toString
}