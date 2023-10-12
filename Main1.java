import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt() - 1;
        int m = scanner.nextInt() - 1;
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;

        long ans = factorial(n + m);
        ans /= factorial(n);
        ans /= factorial(m);

        long ans1 = factorial(x + y);
        ans1 /= factorial(x);
        ans1 /= factorial(y);

        int x1 = n - x;
        int y1 = m - y;

        long ans2 = factorial(x1 + y1);
        ans2 /= factorial(x1);
        ans2 /= factorial(y1);

        System.out.println(ans - (ans1 * ans2));
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
