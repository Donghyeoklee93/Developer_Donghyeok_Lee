public class Recursion13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int begin = 0;
        int end = arr.length - 1;
        int target;

        System.out.println(search(arr, begin, end, 3));
        System.out.println(search(arr, begin, end, 9));
    }

    public static int search(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else if (target == data[end]) {
            return end;
        } else {
            return search(data, begin, end-1, target);
        }
    }
}