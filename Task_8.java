package Task_acmp;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] number = new int[3];
        int i = 0;

        for (String str1 : str.split(" ")) {
            number[i] = Integer.parseInt(str1);
            i++;
        }
        if (number[0] * number[1] == number[2]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
