import java.util.Scanner;

public class RecursionApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n_factorial = factorial(n);

        System.out.println(n_factorial);

    }

    static int factorial(int n) {
        int result;

        if (n == 0)
            return 1;

        else {
            return n * factorial(n - 1);
        }

    }

}
