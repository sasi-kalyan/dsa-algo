package classic;

public class CountOccurrences {

    public static int count(String str, char c){

        if(str.length() == 0)
            return 0;

        if(str.charAt(0) == c){
            return 1 + count(str.substring(1), c);
        }

        return count(str.substring(1), c);
    }

    public static void main(String[] args) {

        String str = "bananna";

        System.out.println("count of character; " + count(str, 'b'));
    }
}
