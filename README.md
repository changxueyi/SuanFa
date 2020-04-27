#面试
Java数组的三种打印方式
（1）传统的for循环方式
```java
for(int i=0;i<array.length;i++)
{
      System.out.println(array[i]);
}
```
（2）for each循环
```java

for(int a:array)
    System.out.println(a);
```
(3）利用Array类中的toString方法
```java

int[] array = {1,2,3,4,5};
System.out.println(Arrays.toString(array));
```
   推荐使用
请解释一下这行代码a [s1.charAt(i) - 'a'] ++;
```java
for (int i = 0; i < s1.length(); i++)
    a[s1.charAt(i) - 'a']++;
```
s1.charAt(i)返回s1 i的第th个字符String. 假设此String仅包含小写字母(即'a'到'z'),s1.charAt(i)-'a'将字符'a'映射到索引0,将'b'映射到索引1,依此类推('z'映射到索引25) .
```java
a[s1.charAt(i)-'a']++;
```
递增与该字符对应的计数器s1.charAt(i).

因此,此循环计算每个字母的出现次数String s1.

最后,a[0]将包含'a' a[1]的数量,'b'的数量等等.


总结：https://blog.csdn.net/springyh/article/details/80603285
list转set集合：只需要在set集合中传入list即可
set集合转化为list集合，和上面一样，只需要在list集合方法形参里面传入set集合
set集合转化为数据：toArray() 方法
list集合转化位数组：toAyyay()方法
数组转化为lit集合：Arrays.asList(数组)
数组转化为set集合：数组先转化位list集合，然后作为形参传入到set集合中
```java
public static void mian(String[] args){
    //数组转化为set集合思路
    //数组先转化为list集合,然后list转化为set集合
    String[] str = {"a","b","c","d" };
    List<String> asList = Arrays.aslist(str);
    Set<String> set = new HashSet<String>(asList);
    for(String string:set){
    system.out.print(string)；
}
}
```
##关于位运算
& 与 两个位都是1，结果才是1
| 或 两个位都是0，结果才位0
^ 异或 相同为0，不同为1
0&0=0  0&1=0  1&0=0  1&1=1
总结：两位同时为1，结果才为1，否则结果为0。
只要根据最未位是0还是1来决定，为0就是偶数，为1就是奇数。因此可以用if ((a & 1) == 0)代替if (a % 2 == 0)来判断a是不是偶数。
####判断奇偶数字
(数字&1==0) 说明是0，是偶数
(数字&0==0) 说明是1，是奇数

##数组拷贝
java的arrayCopy用法
它可以实现将一个数组的指定个数元素复制到另一个数组中
直接举例:

arrayCopy( arr1, 2, arr2, 5, 10);

意思是;将arr1数组里从索引为2的元素开始, 复制到数组arr2里的索引为5的位置, 复制的元素个数为10个. 

举例:
```java

Int[] arr1 ={1,2,3,4,5};

arrayCopy(arr1, 3, arr1, 2, 2);

意思是:将arr1从数字4开始 拷贝到arr1的数字3的位置, 拷贝2个数, 也就是说将4和5 拷贝到数字3的位置,相当于删除数字3.
```
队列的add与offer的区别
两个方法都表示往队列里添加元素

但是当出现异常时，add方法抛出异常

而offer则返回的是false，就是啥事也没有，也不抛异常，也没有添加成功

Java队列的poll,peek,element的区别
poll,peek,element的共同点：
都是返回队列中的首个元素
不同点：
poll：将首个元素从队列中弹出，如果队列是空的，就返回null
peek：查看首个元素，不会移除首个元素，如果队列是空的就返回null
element：查看首个元素，不会移除首个元素，如果队列是空的就抛出异常NoSuchElementException


java.util.LinkedList.pollLast()
offerLast(element)指定元素添加在列表的末尾，
pollLast()返回列表的最后一个元素并从列表中移除