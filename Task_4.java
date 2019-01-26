package Task_acmp;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N = sc.nextByte();
        double M = 9;
        double B = (M - N) / 100;
        M = M / 10;
        double sum = (N + M + B) * 100;
        System.out.println((int) sum);
    }
}
