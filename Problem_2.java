import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (Math.abs(arr[i] - arr[0]) % k != 0) {
                System.out.println(-1);
                return;
            }
        }

        int minOperations = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int target = arr[i];
            int operations = 0;

            for (int j = 0; j < n; j++) {
                operations += Math.abs(arr[j] - target) / k;
            }
            if (operations < minOperations) {
                minOperations = operations;
            }
        }

        System.out.println(minOperations);
    }
}
