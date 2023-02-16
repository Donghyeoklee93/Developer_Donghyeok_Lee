public class Recursion7 {
    public static void main(String[] args) {
        int m = 9;
        int n = 6;
        int result = gcd(m, n);
        System.out.println(result);
    }

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
