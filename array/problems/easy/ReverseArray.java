package problems.easy;

public class ReverseArray {


    public static int[] reverse(int[] arr, int n){
        int i = 0, j = n - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        arr = reverse(arr, arr.length);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
