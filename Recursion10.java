public class Recursion10 {
    public static void main(String[] args) {
        int n = 7;
        printInBinary(n);
    }

    public static void printInBinary(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            printInBinary((n / 2));
            System.out.print(n % 2);
        }
    }
}
