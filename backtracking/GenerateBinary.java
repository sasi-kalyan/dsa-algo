public class GenerateBinary {

    //Generate all binary numbers using backtracking.
    public static void generate(String curr, int len){

        if(curr.length() == len){
            System.out.println(curr);
            return;
        }

        generate(curr + "0", len);
        generate(curr + "1", len);
    }

    public static void main(String[] args) {

        generate("", 3);
    }
}
