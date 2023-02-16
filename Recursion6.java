public class Recursion6 {
    public static void main(String[] args){
        int m = 9;
        int n = 6;
        int result = gcd(m, n);
        System.out.println(result);
    }

    public static int gcd(int m, int n){
        if (m < n) {
            int tmp = m; m=n; n=tmp;
        }
        if(m%n ==0){
            return n;
        } else {
            return gcd(n, m%n);
        }
    }
}
