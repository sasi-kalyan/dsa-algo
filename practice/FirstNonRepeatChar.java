import java.util.Map;

public class FirstNonRepeatChar {

    public static void firstNonRepeatChar(String str){

        for(int i =0; i< str.length(); i++){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                System.out.println("first non-repating char: " + str.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {

        String str = "helloworldhwe";
        firstNonRepeatChar(str);
    }
}
