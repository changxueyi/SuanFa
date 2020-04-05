package 链表03;

/**
 * @ClassName ArrayList2
 * @Description 这是自己一步一步写的一个接口，亲自自己写的
 * @Author changxueyi
 * @Date 2020/2/12 13:06
 */
public class ArrayList2<E>{
    int size;
    E elements[];

    public static final int DEFAULT_CAPACITY = 2;
    public static final int ELEMENT_NOT_FOUND = -1;

    //创建构造函数，传入初始容量为10，如果不够则增加
    public ArrayList2(int capaticy) {
        /*capaticy = (capaticy < DEFAULT_CAPACITY ? DEFAULT_CAPACITY : capaticy);*/
        if (DEFAULT_CAPACITY>=capaticy){
            capaticy=DEFAULT_CAPACITY;
        }else{
            capaticy=capaticy;
        }

        //创建一个capaticy的数组

        elements = (E[]) new Object[capaticy];
    }

    public ArrayList2() {
        this(DEFAULT_CAPACITY);
    }

    //清除所有的元素
    public void clear(){
        for (int i = 0;i<size;i++){
            elements[i] = null;
        }
    }

    //元素的数量
    public int  account(){
        return size;
    }

    //是否为空
    public boolean isEmpty(){
        if (size==0){
            return true;
        }else {
            return false;
        }
    }

    //是否包含某个元素---------------------------------
    public boolean contant(E element){
        for (int i = 0 ;i<size;i++){
            if (elements[i] == element)
                return true;
        }
        return false;
    }

    //添加一个元素到尾部-----------------
    public void add(E element){
        add(size,element);

    }

    //设置index位置上的元素
    public void setElements(int index,E element){
        rangeCheck(index);
        elements[index]=element;
    }

    //再index位置上插入一个元素
    public void add(int index,E element){
        rangeCheckForAdd(index);
        ensureCapacity(size+1);
        for (int i = size;i>index;i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;

    }

    //删除index位置的元素
    public void remove(int index){
        rangeCheck(index);
        for (int i = index+1;i<size;i++){
            elements[index-1]=elements[index];
        }
        size--;
        elements[size]=null;
    }
    //查看当前元素的索引
    //找到的话返回一个索引，找不到的话直接return -1；
    public int indexOf(E element) {
        if (element == null) {  // 1
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) return i; // n
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    //用于检查传来的index值是否符合标准
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
    //保证有充足的容量
    public void ensureCapacity(int capacity){
        int oldCapacity = elements.length;
        if (oldCapacity>=capacity) return;

        int newCapacity = oldCapacity + (oldCapacity>>1);
        E[] newElements = (E[])new Object[newCapacity];
        for (int i = 0;i<size;i++){
            newElements[i] = elements[i];
        }
        elements=newElements;
        System.out.println(oldCapacity + "扩容为" + newCapacity);
    }

   //自己来定制toString
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("size:").append(size).append(",【");
        for (int i = 0;i<size;i++){
            if (i!=0){
                string.append(",");
            }
            string.append(elements[i]);
        }
        string.append("】");
        return string.toString();
    }


}