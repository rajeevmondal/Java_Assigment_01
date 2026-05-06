import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s + s;
        int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {
            boolean[] used = new boolean[26];
            int sum = 0;

            for (int j = i; j < i + n; j++) {
                char ch = str.charAt(j);
                if (used[ch - 'a']) {
                    break;
                }

                used[ch - 'a'] = true;
                sum += (ch - 'a' + 1);
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
