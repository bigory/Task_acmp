package Task_acmp;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qualityNumber = sc.nextInt();
        int[] masNumberArrow = new int[qualityNumber];
        int[] prefixFunction = new int[qualityNumber + 1];

        for (int i = 0; i < qualityNumber; i++) {
            masNumberArrow[i] = sc.nextInt();
            prefixFunction[i] = 0;
        }
        int leng = 0;
        for (int i = 1; i < qualityNumber; i++) {
            while (true) {
                if (masNumberArrow[leng] == masNumberArrow[i]) {
                    leng++;
                    break;
                }
                if (leng == 0) {
                    break;
                }
                leng = prefixFunction[leng];
            }
            prefixFunction[i + 1] = leng;
        }
        while (true) {
            int period = qualityNumber - leng;
            if ((qualityNumber - 1) % period == 0) {
                System.out.println(period);
                return;
            } else {
                leng = prefixFunction[leng];
            }
        }
    }
}
