package classic;

public class RecursiveSum {

    public static int sum(int n){
        if(n == 1) //base case
            return 1;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 elements: " + sum(5));
    }
}
