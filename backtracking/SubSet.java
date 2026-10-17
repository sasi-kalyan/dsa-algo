public class SubSet {

    public static void subset(String str, String curr, int ind){
        if(str.length() == ind){
            System.out.println(curr);
            return;
        }
        subset(str, curr + str.charAt(ind), ind + 1);
        subset(str, curr, ind + 1);
    }

    public static void main(String[] args) {

        subset("ABC", "", 0);

    }
}
