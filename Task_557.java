package Task_acmp;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_557 {
    public static void main(String[] args) {

        ArrayList<int[][]> matrixArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int quantityMatrix = sc.nextInt();
        int sizeMatrix = sc.nextInt();
        int numberString = sc.nextInt();
        int numberColumn = sc.nextInt();
        int simpleNumber = sc.nextInt();
        int sum;

        for (int i = 0; i < quantityMatrix; i++) {
            matrixArr.add(new int[sizeMatrix][sizeMatrix]);
            for (int j = 0; j < sizeMatrix; j++) {
                for (int l = 0; l < sizeMatrix; l++) {
                    matrixArr.get(i)[j][l] = sc.nextInt();
                }
            }
        }
        sc.close();
        if (quantityMatrix == 1) {
            System.out.println(matrixArr.get(0)[numberString - 1][numberColumn - 1]);
        } else {
            if (sizeMatrix == 1) {
                sum = 1;
                for (int i = 0; i < quantityMatrix; i++) {
                    sum *= matrixArr.get(i)[0][0];
                    if (sum >= simpleNumber) {
                        sum = sum % simpleNumber;
                    }
                }
                System.out.println(sum);
            } else {
                ArrayList<int[][]> matrixFinish = new ArrayList<>();
                int[][] matrixFin = new int[sizeMatrix][sizeMatrix];
                int sumMax = 0;
                sum = 0;
                for (int i = 1; i < quantityMatrix; i++) {
                    matrixFinish.add(new int[sizeMatrix][sizeMatrix]);
                    for (int l = 0; l < sizeMatrix; l++) {
                        matrixFin[numberString - 1][l] = 0;
                        for (int j = 0; j < sizeMatrix; j++) {
                            if (i == 1) {
                                sum = matrixArr.get(i - 1)[numberString - 1][j] * matrixArr.get(i)[j][l];
                            } else {
                                sum = matrixFinish.get(i - 2)[numberString - 1][j] * matrixArr.get(i)[j][l];
                            }
                            sumMax += sum;
                            if (sumMax >= simpleNumber) {
                                sumMax = sumMax % simpleNumber;
                            }
                        }
                        if (i == 1) {
                            matrixFinish.get(i - 1)[numberString - 1][l] = sumMax;
                        } else {
                            matrixFinish.get(i - 1)[numberString - 1][l] = sumMax;
                        }
                        sumMax = 0;
                    }

                }
                System.out.println(matrixFinish.get(matrixFinish.size() - 1)[numberString - 1][numberColumn - 1]);
            }
        }
    }
}




