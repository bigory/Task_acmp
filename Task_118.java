package Task_acmp;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_118 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> listParticipants = new LinkedList<>();

        for (int j = 0; j < n; j++) {
            listParticipants.add(j + 1);
        }
        if (n != 1) {
            int pos = 0;
            while (listParticipants.size() != 1) {
                pos = (pos + k - 1) % listParticipants.size();
                listParticipants.remove(pos);
            }
        }
        System.out.println(listParticipants.get(0));
    }
}



