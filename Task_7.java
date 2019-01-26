package Task_acmp;

import java.math.BigInteger;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger C = sc.nextBigInteger();

        int x = A.compareTo(B);
        int y = B.compareTo(C);
        int z = C.compareTo(A);
        if (x >= y & x > z) {
            System.out.println(A);
        } else if (x < y & y >= z) {
            System.out.println(B);
        } else {
            System.out.println(C);
        }
        /*
        String str = sc.nextLine();
        String[] number = new String[3];
        int i = 0;

        for (String str1 : str.split(" ")) {
            number[i] = str1;
            i++;
        }
        BigInteger A = new BigInteger(number[0]);
        BigInteger B = new BigInteger(number[1]);
        BigInteger C = new BigInteger(number[2]);
        int x = A.compareTo(B);
        int y = B.compareTo(C);
        int z = C.compareTo(A);
        System.out.println(x + " " + y + " " + z);
        if (x >= y & x > z) {
            System.out.println(number[0]);
        } else if (x < y & y >= z) {
            System.out.println(number[1]);
        } else {
            System.out.println(number[2]);
        }
        int x1 = number[0].compareTo(number[1]);
        int y1 = number[1].compareTo(number[2]);
        int z1 = number[2].compareTo(number[0]);
        System.out.println(x1 + " " + y1 + " " + z1);
        if (x1 >= y1 & x1 > z1) {
            System.out.println(number[0]);
        } else if (x1 < y1 & y1 >= z1) {
            System.out.println(number[1]);
        } else {
            System.out.println(number[2]);
        }
    }
}*/
    }
}


