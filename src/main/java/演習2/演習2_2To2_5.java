package 演習2;

import java.util.Arrays;
import java.util.Scanner;

public class 演習2_2To2_5 {

    /**
     * 配列bの全要素を配列aに逆順にコピーする
     */
    static void rCopy(int[] a, int[] b) {
        reverse(b);
        copy(a,b);
    }

    /**
     * 配列bの全要素を配列aにコピーする
     * @param a
     * @param b
     */
    static void copy(int[] a, int[] b) {
        for (int i=0; i < a.length; i++) {
            a[i] = b[i];
        }
    }

    /**
     * 配列の全要素の合計を求める
     * @return
     */
    static int sumOf(int[] a) {
        int sum = 0;
        for (int ele: a) {
            sum += ele;
        }
        return sum;
    }

    /**
     * 指定した要素と要素を入れ替える
     * @param a
     * @param index1
     * @param index2
     */
    static void swap(int[] a, int index1, int index2) {
        System.out.println("a[" + index1 + "]とa[" + index2 + "]を交換します");
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
        System.out.println(Arrays.toString(a));
    }

    /**
     * 配列を逆順にする
     * @param a
     */
    static void reverse(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[] a = {2,5,1,3,9,6,7};
        System.out.println("a配列:" + Arrays.toString(a));
        reverse(a);
        System.out.println("反転が終了しました");
        System.out.println("数値の合計は" + sumOf(a) + "です");
        int[] b = {6,8,9,9,3,2,1};
        System.out.println("b配列:" + Arrays.toString(b));
        System.out.println("bをaにコピーします");
        copy(a,b);
        System.out.println("コピー後のa配列:" + Arrays.toString(a));
    }
}
