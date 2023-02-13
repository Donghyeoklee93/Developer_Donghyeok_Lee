import java.util.Scanner;
import java.util.Arrays;

public class ArrayRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(iterativeSum(arr));
        System.out.println(recursiveSum(arr, 0));

        boolean test1 = recursiveSearch(arr, 5,0);
        boolean test2 = recursiveSearch(arr, 8,0);


        System.out.println("result of test 1 " + test1);
        System.out.println("result of test 1 " + test2);

    }


    static int recursiveSum(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        } else {
            return arr[index] + recursiveSum(arr, index + 1);
        }
    }

    static boolean recursiveSearch(int arr[], int query, int index) {

        if (index >= arr.length) {
            return false;
        } else if (arr[index] == query) {
            return true;
        } else {
            return recursiveSearch(arr, query, index+1);
        }
    }


    static boolean iterativeSearch(int[] arr, int query) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == query)
                return true;
        }
        return false;
    }

    static int iterativeSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum = sum + val;
        }
        return sum;
    }


}
