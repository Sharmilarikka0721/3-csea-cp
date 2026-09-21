import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int seen = 0;
        int duplicate = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int bit = 1 << (ch - 'a');
            if ((seen & bit) != 0) {
                duplicate = duplicate | bit;
            } else {
                seen = seen | bit;
            }
        }
        int printed = 0;
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int bit = 1 << (ch - 'a');
            if ((duplicate & bit) != 0 &&
                (printed & bit) == 0) {
                System.out.print(ch + " ");
                printed = printed | bit;
                found = true;
            }
        }

        if (!found) {
            System.out.print("No duplicates");
        }

        sc.close();
    }
}
