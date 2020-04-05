package LeetCode.双指针;

/**
 * @ClassName binSearch_1
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/2/26 21:54
 */
public class binSearch_1 {
  public static  int binSerach(int key ,int[] array){
      int low = 0;
      int high = array.length-1;
      int middle = 0;
       //设置限制条件
      if (key<array[low] || key>array[high]||low>high){
          return -1;
      }
      while (low<=high){
          middle = (low+high)/2;
          if (middle==key)
              return array[middle];
          else if (middle<key)
              low = middle+1;
          else
              high = middle-1;
      }
      return -1;
  }
}