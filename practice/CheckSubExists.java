public class CheckSubExists {

    public static boolean check(String str, String sub){

        int i = 0;
        int j = 0;

        while(i < str.length()){
            if(str.charAt(i) == sub.charAt(j)){
                int m = i + 1, counter = 1;
                for(int n = j + 1; n < sub.length(); n++){
                    if(str.charAt(m)!=sub.charAt(n)){
                        j = 0;
                        break;
                    }
                    m++;
                    counter++;
                }

                if(counter == sub.length()){
                    return true;
                }
            }
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "hellojorldjava";
        String sub = "java";

        System.out.println(check(str, sub));
    }
}
