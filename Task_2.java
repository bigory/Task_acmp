package Task_acmp;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = 1;
        int sum = 0;
        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            for (int i = 1; i <= Math.abs(N); i++) {
                sum -= i;
            }
            System.out.println(sum + X);
        }
    }
}
