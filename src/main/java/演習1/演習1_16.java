package 演習1;

import java.util.Scanner;

public class 演習1_16 {

    /**
     * n段のピラミッドを表示する
     * @param n
     */
    static void spira(int n) {
        int lastDotNumber = (n-1)*2+1;
        for (int i = 1; i<=n; i++) {
            int dotNumber = (i-1)*2+1;
            for (int k = 1; k <= (lastDotNumber-dotNumber)/2;k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= dotNumber; j++) {
                System.out.print(i%10);
            }
            for (int l = 1; l <= (lastDotNumber-dotNumber)/2;l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("ピラミッドの段数:");
            n = stdIn.nextInt();
        } while (n <= 0);

        spira(n);
    }
}
