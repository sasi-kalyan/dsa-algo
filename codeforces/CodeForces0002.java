import java.util.HashSet;
import java.util.Set;

public class CodeForces0002 {

    public static int duplicateCount(String text) {

        char[] carr = text.toLowerCase().toCharArray();
        int fc = 0;

        Set<Character> seen = new HashSet<>();

        for(int i=0;i<carr.length;i++){
            int ic = 1, flag = 0;
            for(int j=0;j<carr.length;j++){
                if(i != j && carr[i] == carr[j] && !seen.contains(carr[i])){
                    seen.add(carr[i]);
                    ic++;
                    flag = 1;
                }

                if(ic > 1 && flag == 1){
                    fc ++;
                    break;
                }
            }
        }

        return fc;
    }

    public static void main(String[] args) {

        System.out.println(duplicateCount("abcAbef"));
    }
}
