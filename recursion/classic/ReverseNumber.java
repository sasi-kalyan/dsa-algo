package classic;

public class ReverseNumber {

    public static int count(int n, int c){
        if( n == 0)
            return c;
        return count(n/10, c + 1);
    }

    public static int reverse(int n){
        if(n==0)
            return 0;
        System.out.println("digit count : " + count(n, 0));
        return (n%10) * (int) Math.pow(10, count(n, 0) - 1) + reverse(n/10);
    }

    public static void main(String[] args) {
        System.out.println("reverse the number: " + reverse(1234));
    }
}
