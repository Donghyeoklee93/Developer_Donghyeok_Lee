public class Recursion11 {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(sum(n, arr));
    }
    public static int sum(int n, int [] data) {
        if(n<=0){
            return 0;
        } else{
            return sum(n-1, data) + data[n-1];
        }
    }
}
