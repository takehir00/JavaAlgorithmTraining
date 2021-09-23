package 演習1;

import java.util.Scanner;

public class 演習1_10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数を入力してください");
        int target;
        while (true) {
            target = stdIn.nextInt();
            if (target > 0) {
                break;
            }
            System.out.println("正の整数を入力してください");
        }

        int digits = 0;
        int divide = 1;
        while (true) {
            if (target / divide < 1) {
                break;
            }
            divide *= 10;
            digits += 1;
        }
        System.out.println("桁数は" + digits + "です。");
    }
}
