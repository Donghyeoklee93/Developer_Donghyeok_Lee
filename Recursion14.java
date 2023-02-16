public class Recursion14 {
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
        } else {
            int middle = (begin + end) / 2;
            if (data[middle] == target) {
                return middle;
            }
            int index = search(data, begin, middle - 1, target);
            if (index != -1) {
                return index;
            } else {
                return search(data, middle + 1, end, target);
            }

        }
    }
}
