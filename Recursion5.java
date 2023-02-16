public class Recursion5 {
    public static void main(String[] args) {
        int n = 4;
        int result = fibonacci(n);
        System.out.println(result);
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


