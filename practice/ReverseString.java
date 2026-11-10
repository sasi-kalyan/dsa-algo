public class ReverseString {

    public static String reverse(String str){

        String res = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a,b) -> b + a);
        System.out.println(res);


        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverse(str));
    }
}
