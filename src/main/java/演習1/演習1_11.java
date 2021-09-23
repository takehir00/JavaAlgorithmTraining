package 演習1;

public class 演習1_11 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            // 1行目
            if (i == 0) {
                for (int j = 0; j <= 10; j++) {
                    if (j ==0) {
                        System.out.printf("%3s","");
                    } else if (j == 1) {
                        System.out.print("|");
                    } else {
                        System.out.printf("%3d",j-1);
                    }
                }
                //改行
                System.out.println();
            } else
            // 2行目
            if (i == 1) {
                for (int j = 0; j <= 10; j++) {
                    if (j == 1) {
                        System.out.print("+");
                    } else {
                        System.out.print("---");
                    }
                }
                //改行
                System.out.println();
            } else {
                // ３行目以降、各列掛け算
                for (int j = 0; j <= 10; j++) {
                    if (j ==0) {
                        System.out.printf("%3s", i-1);
                    } else if (j == 1) {
                        System.out.print("|");
                    } else {
                        System.out.printf("%3d", (j-1) * (i-1));
                    }
                }
                //改行
                System.out.println();
            }
        }
    }
}
