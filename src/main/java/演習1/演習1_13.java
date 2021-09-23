package 演習1;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class 演習1_13 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("正方形を表示します");
        System.out.println("辺の長さ:");
        int length = stdIn.nextInt();

        for (int i = 0; i < length; i++) {
            if (i == 0 || i == length-1) {
                Optional<String> result = Stream.generate(() -> "＊").limit(length).reduce((a,b) -> a + b);
                result.ifPresent(System.out::print);
                System.out.println();
            } else {
                System.out.print("＊");
                Optional<String> result = Stream.generate(() -> " ").limit(length).reduce((a,b) -> a + b);
                result.ifPresent(System.out::print);
                System.out.print("＊");
                System.out.println();
            }
        }
    }

}
