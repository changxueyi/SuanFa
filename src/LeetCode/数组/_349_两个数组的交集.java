package LeetCode.数组;

import 队列05.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName _349_两个数组的交集
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/11 21:54
 */
public class _349_两个数组的交集 {
    //给两个数组，返回一个公共的数组
    //想不通，我这个代码的问题出在哪里了
   public static int[] intersection3(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
            map.put(a, 1);
        }
        for (int j = 0; j < nums2.length; j++) {
            int b = nums2[j];
            if (map.containsKey(b)) {
                arrayList.add(b);
                map.remove(b);
            }
        }
        int[] arr = arrayList.stream().mapToInt(p->p.intValue()).toArray();
        return arr;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1)
            set.add(num);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                arr.add(num);
                set.remove(num);
            }
        }

        int[] res = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++)
            res[i] = arr.get(i);

        return res;
    }

    //方式二
    public static int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int a : nums1) {
            hashSet1.add(a);
        }
        for (int b : nums2) {
            hashSet2.add(b);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int c: hashSet1){
            if (hashSet2.contains(c)){
                arrayList.add(c);
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0;i<arrayList.size();i++){
            res[i] = arrayList.get(i);
        }
        return res;

    }

    public static void main(String[] args) {
        int arr1[];
        arr1 = new int[]{1, 2, 2, 1};
        int arr2[];
        arr2 = new int[]{2, 2};
        int[] a = intersection3(arr1, arr2);
        System.out.println(Arrays.toString(a));
    }
}