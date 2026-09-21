import java.util.*;

public class Bucketsort {
    static void bucketSort(double[] arr) {
        int n = arr.length;
        List<Double>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int index;
            if (arr[i] >= 0 && arr[i] < 1) {
                index = (int)(arr[i] * n);
            } else {
                index = (int)arr[i];
                if (index >= n) {
                    index = n - 1;
                }
            }

            buckets[index].add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (double value : buckets[i]) {
                arr[k] = value;
                k++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        bucketSort(arr);

        for (double value : arr) {
            if (value == (int)value) {
                System.out.print((int)value + " ");
            } else {
                System.out.printf("%.2f ", value);
            }
        }

        sc.close();
    }
}
