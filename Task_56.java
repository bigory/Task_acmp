package Task_acmp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task_56 {
    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int quantityFriend = Integer.parseInt(rd.readLine());
        ArrayList<String> friends = new ArrayList<>(quantityFriend);
        ArrayList<String> mutualFriends = new ArrayList<>();
        ArrayList<String> alsoFriend = new ArrayList<>();

        for (int i = 0; i < quantityFriend; i++) {
            friends.add(rd.readLine());
        }

        int quantityMutualFriends = Integer.parseInt(rd.readLine());
        boolean present;

        for (int i = 0; i < quantityMutualFriends; i++) {
            String mutualQuality = rd.readLine();
            present = false;
            for (int j = 0; j < quantityFriend; j++) {
                String friend = friends.get(j);
                present = friend.equals(mutualQuality);
                if (present) {
                    mutualFriends.add(mutualQuality);
                    break;
                }
            }
            if (!present) {
                alsoFriend.add(mutualQuality);
            }
        }
        rd.close();

        Collections.sort(friends);
        Collections.sort(mutualFriends);
        Collections.sort(alsoFriend);

        System.out.print("Friends: ");
        for (int i = 0; i < friends.size(); i++) {
            if (i < friends.size() - 1)
                System.out.print(friends.get(i) + "," + " ");
            else {
                System.out.print(friends.get(i));
            }
        }
        System.out.println();
        System.out.print("Mutual Friends: ");
        for (int i = 0; i < mutualFriends.size(); i++) {
            if (i < mutualFriends.size() - 1)
                System.out.print(mutualFriends.get(i) + "," + " ");
            else {
                System.out.print(mutualFriends.get(i));
            }
        }
        System.out.println();
        System.out.print("Also Friend of: ");
        for (int i = 0; i < alsoFriend.size(); i++) {
            if (i < alsoFriend.size() - 1)
                System.out.print(alsoFriend.get(i) + "," + " ");
            else {
                System.out.print(alsoFriend.get(i));
            }
        }
    }
}
