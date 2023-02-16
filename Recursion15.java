public class Recursion15 {
    public static void main(String[] args) {
        int[] data = {1, 2, 6, 4, 5};
        int begin = 0;
        int end = data.length - 1;

        System.out.println(findMax(data, begin, end));
    }


    public static int findMax(int[] data, int begin, int end) {
        if (begin == end) {
            return data[begin];
        } else {
            return Math.max(data[begin], findMax(data, begin + 1, end));
        }
    }
}
