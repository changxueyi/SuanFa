###02动态数组
####1.数组的创建有三种方式：
 // 静态初始化
 * int intArray2 [] = new int[]{20,21,22};  
  // 静态初始化简化方式
 * int intArray3 [] = {30,31,32};  
  // 动态初始化
 * int[] intArray4 = new int[3];3代表的是三个内存空间  

###自己的问题 
这是自己写的关于动态扩容的例子  
```
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
```
###03链表

###04栈
java charAt() 方法
public char charAt(int index)  
String s ="m.runoob.com";  
char result = s.charAt(8);  
system.out.println(result);
```char表示字符，定义时使用用单引号表示，只能存储一个字符

public class CharDemo {
	public static void main(String[] args) {
		char a = 'J';
		char b='Java';//会报错
	}
}而String表示字符串，定义时使用双引号表示，可以存储0个或多个字符,其实string类型就是char类型的数组表现形式。
public class StringDemo {
	public static void main(String[] args) {
		String a = "Java";
		String b = "";
		String c='Java';//会报错,类型不匹配
	}
}
```
###05：队列
```java
创建一个数组，需要经历步，第一步定义，第二步分配内存；

```

