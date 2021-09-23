package 演習2;

import java.util.Scanner;

public class 演習2_6 {

    // 変換するメソッド
    static int cardConvert(int no, int cd, char[] cno) {
        int digits = 0; //変換後の桁数
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(cd + "|" + no);
        System.out.println(" " + "+");
        System.out.print("------------------");
        do {
            int surplus = no % cd;
            cno[digits++] = dChar.charAt(surplus);
            no /= cd;
            System.out.println(cd + "|" + no + "...." + surplus);
        } while(no != 0);

        for (int i = 0; i < digits/2; i++) {
            char t = cno[i];
            cno[i] = cno[digits -i -1];
            cno[digits -i -1] = t;
        }
        return digits;
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int no; // 変換する整数
        int cd; // 基数
        int dno; //桁数
        char[] cno = new char[32]; // 変換後の各行を格納する文字列


        System.out.println("10進数を基数変換します。");

        do {
            System.out.print("変換する非負の整数：");
            no = stdIn.nextInt();
        } while(no < 0);

        do {
            System.out.print("何進数に変換しますか。(2-36)");
            cd = stdIn.nextInt();
        } while(cd<2 || cd>36);

        dno = cardConvert(no, cd, cno);

        System.out.println(cd + "進数では");
        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }
        System.out.println("です");
    }
}
