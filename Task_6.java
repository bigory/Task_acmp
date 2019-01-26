package Task_acmp;

import java.util.*;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strokeLine = sc.nextLine();
        char[] masDigit = {'1', '2', '3', '4', '5', '6', '7', '8'};
        char[] masLetter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int xOne = 9;
        int yOne = 9;
        int xTwo = 9;
        int yTwo = 9;
        if (strokeLine.length() < 5 || strokeLine.charAt(2) != '-') {
            System.out.println("ERROR");
        } else {
            for (int i = 0; i < 8; i++) {
                if (strokeLine.charAt(0) == masLetter[i]) {
                    xOne = i;
                }
                if (strokeLine.charAt(1) == masDigit[i]) {
                    yOne = i;
                }
                if (strokeLine.charAt(3) == masLetter[i]) {
                    xTwo = i;
                }
                if (strokeLine.charAt(4) == masDigit[i]) {
                    yTwo = i;
                }
            }
            if (xOne == 9 || yOne == 9 || xTwo == 9 || yTwo == 9) {
                System.out.println("ERROR");
            } else {

                if (xOne + 1 == xTwo & yOne + 2 == yTwo || xOne - 1 == xTwo & yOne + 2 == yTwo) {
                    System.out.println("YES");
                } else if (xOne + 2 == xTwo & yOne + 1 == yTwo || xOne + 2 == xTwo & yOne - 1 == yTwo) {
                    System.out.println("YES");
                } else if (xOne + 1 == xTwo & yOne - 2 == yTwo || xOne - 1 == xTwo & yOne - 2 == yTwo) {
                    System.out.println("YES");
                } else if (xOne - 2 == xTwo & yOne + 1 == yTwo || xOne - 2 == xTwo & yOne - 1 == yTwo) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}

