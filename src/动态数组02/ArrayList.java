package 动态数组02;

/**
 * @ClassName ArrayList
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/10 15:30
 */
public class ArrayList<E> {
    /**
     * 元素数量
     */
    private int size;
    //所有的元素
    private E[] elements;
    public static final int DEFAULT_CAPACITY = 10;
    public static final int ELEMENT_NOT_FOUND = -1;


    public ArrayList(int capaticy) {
        capaticy = (capaticy < DEFAULT_CAPACITY ? DEFAULT_CAPACITY : capaticy);
        //创建一个capaticy的数组

        elements = (E[])new Object[capaticy];
    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    //元素的数量
    public int size() {
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
        if (indexOf(element) != ELEMENT_NOT_FOUND) {
            return true;
        }
        return false;
    }

    //增加一个元素
    public void add(E element) {
        add(size, element);
    }

    //返回index对应的元素
    public E get(int index) {
        rangeCheck(index);

        return elements[index];
    }

    //设置index位置上的元素
    //例如：传来一个1，就在size=1,上放入这个数字
    //返回原来的元素
    public E set(int index, E element) {
        rangeCheck(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    //向index位置上添加元素
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    //删除index上的元素
    public void remove(int index) {
        rangeCheck(index);
        for (int i = index + 1; i < size; i++) {
            elements[index] = elements[index + 1];
        }
        size--;
        elements[size]=null;
    }

    //看下这个位置的索引
    //找到返回索引，找不到返回-1
    //==比较的是内存地址，equals比较的是对象是否是一样的，比如常学奕 equals 常学奕 两个对象的比较
    public int indexOf(E element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i <= size; i++) {
                if (element.equals(elements[i])) return i;
                }
            }
            return ELEMENT_NOT_FOUND;

       }

    //清除所有的元素
    public void clear() {
        for(int i = 0 ; i<size;i++){
            elements[i]=null;
        }
        size=0;
    }

    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            outOfBounds(index);
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }

    /*扩容,首先必须要有自己的容量*/
    private void ensureCapacity(int capacity) {
        //为什么这样定义，比如：扩容后的还是被定义为老容量
        int oldCapacity = elements.length;
        if (oldCapacity >= size) return;

        // 新容量为旧容量的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;

        System.out.println(oldCapacity + "扩容为" + newCapacity);

    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("size=").append(size).append(",[");
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                string.append(",");
            }
            string.append(elements[i]);
        }
        string.append("]");
        return string.toString();
    }

}