package Task_acmp;

import java.util.ArrayList;
import java.util.Scanner;


public class Task_557_1 {
    public static void main(String[] args) {

        ArrayList<int[][]> matrixArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int quantityMatrix = sc.nextInt();
        int sizeMatrix = sc.nextInt();
        int numberString = sc.nextInt();
        int numberColumn = sc.nextInt();
        int simpleNumber = sc.nextInt();


        for (int i = 0; i < quantityMatrix; i++) {
            matrixArr.add(new int[sizeMatrix][sizeMatrix]);
            for (int j = 0; j < sizeMatrix; j++) {
                for (int l = 0; l < sizeMatrix; l++) {
                    matrixArr.get(i)[j][l] = sc.nextInt();
                }
            }
        }

        if (quantityMatrix == 1) {
            System.out.println(matrixArr.get(0)[numberString - 1][numberColumn - 1]);
        } else {

            ArrayList<Integer> currentMatrix = new ArrayList<>();
            int sum;

            int sumMax = 0;

            for (int i = 1; i < quantityMatrix; i++) {
                for (int l = 0; l < sizeMatrix; l++) {
                    sum = 0;

                    for (int j = 0; j < sizeMatrix; j++) {
                        if (i == 1) {
                            sum += matrixArr.get(i - 1)[numberString - 1][j] * matrixArr.get(i)[j][l];
                        } else {
                            sum += currentMatrix.get(j) * matrixArr.get(i)[j][l];
                        }
                        if (sum >= simpleNumber) {
                            sum = sum % simpleNumber;
                        }
                        sumMax = sum;
                    }
                    currentMatrix.add(currentMatrix.size(), sumMax);
                }
                if (quantityMatrix >= 3) {
                    for (int s = 0; currentMatrix.size() > sizeMatrix; ) {
                        currentMatrix.remove(s);
                    }
                }
            }
            System.out.println(currentMatrix.get(numberColumn - 1));
        }
    }
}













