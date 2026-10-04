import java.util.*;

public class Solution {

    static int n;
    static int[] arr;
    static int total;
    static int minDiff = Integer.MAX_VALUE;

    static void solve(int index, int count, int sum, int targetCount) {

        // If required number of people is selected
        if (count == targetCount) {
            int otherSum = total - sum;
            int diff = Math.abs(sum - otherSum);

            if (diff < minDiff) {
                minDiff = diff;
            }
            return;
        }

        // No more elements available
        if (index == n) {
            return;
        }

        // Not enough elements remaining
        if (n - index < targetCount - count) {
            return;
        }

        // Choose current person
        solve(index + 1, count + 1, sum + arr[index], targetCount);

        // Don't choose current person
        solve(index + 1, count, sum, targetCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        // For even N, both groups must have N/2 people.
        // For odd N, groups can differ by 1.
        int targetCount = n / 2;

        solve(0, 0, 0, targetCount);

        System.out.println(minDiff);

        sc.close();
    }
}
