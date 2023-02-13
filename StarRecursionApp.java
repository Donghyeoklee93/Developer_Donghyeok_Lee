import java.util.Scanner;

public class StarRecursionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);
    }

    static void printStar(int n) {
        String star = "";
        if (n == 0) {

        } else {
            System.out.print("*");
            printStar(n - 1);
        }

    }
}
