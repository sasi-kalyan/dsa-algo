package classic;

public class RecRevStr {

    public static String reverse(String s){

        if(s.length() == 0)
            return "";

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("string reversed: " + reverse(str));
    }
}
