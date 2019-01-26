package Task_acmp;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        ArrayList<Integer> ratingFour = new ArrayList<>();
        ArrayList<Integer> ratingThree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextByte();
            if (x % 2 == 0) {
                ratingFour.add(x);
            } else {
                ratingThree.add(x);
            }
        }
        for (int i = 0; i < ratingThree.size(); i++) {
            if (i == 0) {
                System.out.print(ratingThree.get(i));
            } else {
                System.out.print(" " + ratingThree.get(i));
            }
        }
        System.out.println();
        for (int i = 0; i < ratingFour.size(); i++) {
            if (i == 0) {
                System.out.print(ratingFour.get(i));
            } else {
                System.out.print(" " + ratingFour.get(i));
            }
        }
        System.out.println();
        if (ratingFour.size() >= ratingThree.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
