public class Recursion8 {
    public static int length(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + length(str.substring(1));

        }
    }


    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "";
        System.out.println(length(str1));
        System.out.println(length(str2));

    }
}
