package Task_acmp;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        double sum;
        double X = 0.25;
        long currentN = N / 10;
        sum = (currentN * (currentN + 1) + X) * 100;
        System.out.println((long) sum);
    }
}
