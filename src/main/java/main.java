import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int[] a = new int[5];

        int[] b = {1,2,3,4,5};

        int max = b[0];
        for(int i = 1; i < b.length; i++) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        System.out.println(max);
    }
}
