package sorting;

public class SelectionSortExample {

    public static int[] selectionSort(int[] arr, int n){

        if(arr.length == 0) return arr;

        for(int i = 0; i < n; i++){

            int minIndex = i;

            for(int j = i + 1; j < n; j++){

                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        arr = selectionSort(arr, arr.length);

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
