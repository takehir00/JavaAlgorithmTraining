package 演習3;

import java.util.Scanner;

public class 演習3_3 {

    public static void main (String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];				// 要素数numの配列

        System.out.println("昇順に入力してください。");

        System.out.print("x[0]：");		// 先頭要素の読込み
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            } while (x[i] < 0);	// 一つ前の要素より小さければ再入力させる
        }

        System.out.print("探す値：");			// キー値の読込み
        int key = stdIn.nextInt();

        // keyと一致した要素のインデックスを格納
        int[] idx = new int[num];

        int idcCount = search(key,x,idx);
        System.out.print("一致した要素のインデックスは、{");
        for (int i = 0; i < idcCount; i++) {
            System.out.print(idx[i]);
        }
        System.out.println("}");
        System.out.println("一致しさ要素数は:" + idcCount);

    }

    private static int search(int key, int[] x, int[] idx) {
        int idxCount = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == key) {
                idx[idxCount] = i;
                idxCount++;
            }
        }
        return idxCount;
    }

}
