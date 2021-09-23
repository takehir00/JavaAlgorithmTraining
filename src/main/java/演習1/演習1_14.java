package 演習1;

import java.util.Scanner;

public class 演習1_14 {

    /**
     * 左下に直角二等辺三角形を表示
     */
    static void triangleLB(int n) {
        for (int i = 1;i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 左上が直角の二等辺三角形
     * @param n
     */
    static void triangleLU(int n) {
        for (int i = n;i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 右上が直角の二等辺三角形
     * @param n
     */
    static void triangleRU(int n) {
        for (int i = n;i >= 1; i--) {
            for (int k = 1; k<=(n-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * 右下が直角の二等辺三角形
     * @param n
     */
    static void triangleRB(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
         do {
             System.out.print("短編の長さ:");
             n = stdIn.nextInt();
        } while (n <= 0);

         triangleRB(n);
    }
}
