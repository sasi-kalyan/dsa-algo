public class PalindromeCheck {

    public static boolean palindromeCheck(String str){

        char[] arr = str.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();

        int i = 0, j = arr.length - 1;

        while (i < j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++; j--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeCheck("ma dam"));
    }
}
