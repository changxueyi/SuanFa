package Test.测试;

/**
 * @ClassName _11_旋转数组的最小数字
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/24 12:42
 */
public class _11_旋转数组的最小数字 {
    public int minArray(int[] numbers) {
            int i = 0, j = numbers.length - 1;
            while (i < j) {
                int m = (i + j) / 2;
                if (numbers[m] > numbers[j]) i = m + 1;
                else if (numbers[m] < numbers[j]) j = m;
                else j--;
            }
            return numbers[i];
        }
    }
