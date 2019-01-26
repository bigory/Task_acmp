package Task_acmp;

import java.util.Scanner;

public class Task_303 {
    public static void main(String[] args) {
        Scanner scan;
        String primaryNumber;
        scan = new Scanner(System.in);
        primaryNumber = scan.nextLine();

        char x;
        int sum;
        int sumMax = -9999;

        for (int j = 0; j <=primaryNumber.length() - 1; j++) {
            StringBuilder currentNumber = new StringBuilder(primaryNumber);
            currentNumber.deleteCharAt(j);
            sum = 0;

            for (int i = 0; i <= currentNumber.length() - 1; i++) {
                x = currentNumber.charAt(i);
                if (i % 2 == 0) {
                    sum += Character.getNumericValue(x);
                } else {
                    sum -= Character.getNumericValue(x);
                }
            }
            if (sum >= sumMax) {
                sumMax = sum;
            }
        }
        System.out.println(sumMax);
    }
}




