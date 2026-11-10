package sorting;

public class BubbleSortExample {

    public static int[] bubbleSort(int[] arr, int n){
        if(arr.length == 0) return arr;

        for(int i = 0; i < n - 1; i++){

            for(int j = 0; j < (n - 1 - i); j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] bubbleSort2(int[] arr, int n){

        int st = 0, ed = n-1;

        while(st < ed){

            int lastSwap = st;

            for(int i = st; i<ed; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    lastSwap = i;
                }
            }

            ed = lastSwap;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 9, 2, 6, 8};

        arr = bubbleSort2(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
}
