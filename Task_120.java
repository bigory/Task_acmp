package Task_acmp;

import java.util.Scanner;

public class Task_120 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qualityString = sc.nextInt();
        int qualityColumn = sc.nextInt();
        int[][] matrixWay = new int[qualityString][qualityColumn];

        for (int i = 0; i < qualityString; i++) {
            for (int j = 0; j < qualityColumn; j++) {
                matrixWay[i][j] = sc.nextInt();
                if (i > 0 && j > 0) {
                    matrixWay[i][j] += Math.min(matrixWay[i - 1][j], matrixWay[i][j - 1]);
                } else {
                    if (i > 0) {
                        matrixWay[i][j] += matrixWay[i - 1][j];
                    } else if (j > 0) {
                        matrixWay[i][j] += matrixWay[i][j - 1];
                    }
                }
            }
        }
        System.out.println(matrixWay[qualityString - 1][qualityColumn - 1]);
    }
}
