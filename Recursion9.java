public class Recursion9 {
    public static void main(String[] args){
    String str1 = "Donghyeok Lee";
    String str2 = "Software Developer";
        printCharReverse(str1);
        System.out.println();
        printCharReverse(str2);
    }

    public static void printCharReverse(String str){
        if (str.length() == 0){
            return;
        } else {
            printCharReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
}
