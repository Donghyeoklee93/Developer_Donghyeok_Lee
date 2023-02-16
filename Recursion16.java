public class Recursion16 {
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
            int middle = (begin+end) / 2;
            int max1 = findMax(data, begin, middle);
            int max2 = findMax(data, middle+1, end);
            return Math.max(max1, max2);
        }
    }
}
