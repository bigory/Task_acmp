package Task_acmp;

import java.util.Scanner;

public class Task_281 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long qualityWin;
        long periodWin = 0;
        long factorialN;
        long factorialM;
        long factorialNm;
        int defNm = n - m;
        Facktorial facktN = new Facktorial();
        Facktorial facktM = new Facktorial();
        Facktorial facktNm = new Facktorial();

        if (n == m || n == 1) {
            if (m == 0) {
                qualityWin = 2;
            } else {
                qualityWin = 1;
            }
            periodWin = qualityWin;
            System.out.println(periodWin);

        } else {
            for (int j = 0; j <= defNm; j++) {
                factorialN = facktN.searchFacktorial(n);
                factorialM = facktM.searchFacktorial(m);
                factorialNm = facktNm.searchFacktorial(n - m);

                qualityWin = (factorialN / ((factorialNm) * factorialM));
                periodWin += qualityWin;
                m++;
            }
            System.out.println(periodWin);
        }
    }
}

class Facktorial {
    long searchFacktorial(int quantity) {
        int i = 1;
        long valueFactorial = 1;
        while (i <= quantity) {
            valueFactorial *= i;
            i++;
        }
        return valueFactorial;
    }
}




