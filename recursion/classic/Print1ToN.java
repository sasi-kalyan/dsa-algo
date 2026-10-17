package classic;

public class Print1ToN {

    public static void print(int n){
        if(n == 0)
            return;

        print(n - 1);
        System.out.println("next number: " + n);
    }

    public static void main(String[] args) {
        print(5);
    }
}
