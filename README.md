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