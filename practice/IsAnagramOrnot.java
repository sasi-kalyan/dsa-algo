import java.util.Set;
import java.util.stream.Collectors;

public class IsAnagramOrnot {


    public static boolean isanagram(String a, String b){
        String res = new StringBuilder(a+b).toString();
return true;
    }

    public static void main(String[] args) {
        boolean isanag  = isanagram("hello", "hello");
        System.out.println(isanag);
    }
}
