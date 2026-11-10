import java.util.LinkedList;

public class CompressString {

    public static void compress(String str){

        StringBuilder sb = new StringBuilder();

        int c = 1;
        for(int i=1;i<=str.length();i++){
            if(i < str.length() && str.charAt(i) == str.charAt(i-1)){
                c++;
            }else{
                sb.append(str.charAt(i -1)).append(c);
                c = 1;
            }
        }

        System.out.println(sb.toString());

    }

    public static void main(String[] args) {
        String str = "aabcccccaa";
        compress(str);
    }
}
