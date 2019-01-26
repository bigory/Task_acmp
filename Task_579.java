package Task_acmp;

import java.util.Scanner;
import java.util.ArrayList;

public class Task_579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        ArrayList<Integer> polmas = new ArrayList<>();
        ArrayList<Integer> otrmas = new ArrayList<>();

        int pol = 0;
        int otr = 0;
        int[] arr1 = new int[x];

        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i] >= 0) {
                int pol1 = arr1[i];
                pol += pol1;
                polmas.add(i + 1);

            } else {
                int otr1 = arr1[i];
                otr += Math.abs(otr1);
                otrmas.add(i + 1);
            }
        }
        if (pol >= otr) {
            System.out.println(polmas.size());
            for (int i = 0; i <= polmas.size() - 1; i++) {
                System.out.print(polmas.get(i) + " ");
            }
        } else {
            System.out.println(otrmas.size());
            for (int i = 0; i <= otrmas.size() - 1; i++) {
                System.out.print(otrmas.get(i) + " ");
            }
        }
    }
}

