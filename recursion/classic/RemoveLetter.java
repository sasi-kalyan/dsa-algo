package classic;

public class RemoveLetter {


    public static String remove(String s){
        if(s.length() == 0)
            return "";

        if(s.charAt(0) == 'a'){
            return remove(s.substring(1));
        }

        System.out.println(s.charAt(0));
        return s.charAt(0)  + remove(s.substring(1));
    }

    public static void main(String[] args) {
        remove("bananna");
    }
}
