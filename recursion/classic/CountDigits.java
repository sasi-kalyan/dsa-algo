package classic;

public class CountDigits {

    public static int count(int n, int c){
        if(n == 0)
            return c;

        //System.out.println(n);
        return count(n/10, c + 1);
    }

    public static void main(String[] args) {

        System.out.println("Count of digits in number: " + count(1233242343, 0));
    }
}
