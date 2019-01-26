package Task_acmp;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        ArrayList<Integer> roots = new ArrayList<>();
        for (int i = -100; i <= 100; i++) {
            if (A * (i*i*i) + B * (i*i) + C * i + D == 0) {
                roots.add(i);
            }
        }
        for (Integer root : roots) {
            System.out.print(root + " ");
        }
    }
}
