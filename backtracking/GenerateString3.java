public class GenerateString3 {

    public static void generate(String s){

        if(s.length() == 3){
            System.out.println(s);
            return;
        }

        generate("A" + s);
        generate("B" + s);
        generate("C" + s);
    }

    public static void main(String[] args) {
        generate("");
    }
}
