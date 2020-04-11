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