package Test2;

/**
 * @ClassName MaoPao
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/4/2 20:58
 */
public class MaoPao {
    public static void mao(int[] arr) {
        //判定下，如果传入的数组长度小于2，直接就别排序了，因为就有一个数字，直接return
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("最终得出的数组为：");
        for (int k =0 ; k < arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }

    public static void main(String[] args)   {
        int arr[];
        arr= new int[]{1,4,2,5,6,3};
      //  int[] arr= {1,3,2,5,4,6};
        MaoPao maoPao = new MaoPao();
        maoPao.mao(arr);
    }
}