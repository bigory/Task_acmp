package Task_acmp;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = 0;
        int min = 100000;
        int sumPositive = 0;
        int productMinMax = 1;
        int c = 0;
        int s = 0;
        int[] qualityDigital = new int[x];
        for (int i = 0; i < qualityDigital.length; i++) {
            qualityDigital[i] = sc.nextInt();
        }
        for (int i = 0; i < qualityDigital.length; i++) {
            if (qualityDigital[i] > 0) {
                sumPositive += qualityDigital[i];
            }
            if (qualityDigital[i] > max) {
                max = qualityDigital[i];
                c = i;
            }
            if (qualityDigital[i] < min) {
                min = qualityDigital[i];
                s = i;
            }
        }
        if (c + 1 == s || s + 1 == c) {
            productMinMax = min;
        } else {
            if (c > s)
                for (int i = s + 1; i < c; i++) {
                    productMinMax *= qualityDigital[i];
                }
            else {
                for (int i = c + 1; i < s; i++) {
                    productMinMax *= qualityDigital[i];
                }
            }
        }
        System.out.println(sumPositive + " " + productMinMax);
    }
}