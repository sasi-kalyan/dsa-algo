public class SumOfAll {

    public static int sumOfDigits(String str){

        int sum = 0;
        for(int i = 0; i < str.length(); i++){

            boolean isDigit = Character.isDigit(str.charAt(i));
            if(isDigit){
                int extract = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum += extract;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String str = "hello123world";


        System.out.println(sumOfDigits(str));
    }
}
