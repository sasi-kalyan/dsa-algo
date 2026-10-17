package problems.easy;

public class LongestSubarraySum {


    public static int longestSubarraySum(int[] arr, int n, int k){

        int maxLen = 0;

        for(int i = 0; i < n; i++){

            int sum = 0, cnt = 1;
            for(int j = i; j < n; j++){
                sum += arr[j];

                if(sum == k){
                    maxLen = Math.max(maxLen, cnt);
                }

                cnt++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        //int[] arr = {6, 1, 2};
        int k = 7;

        int c = longestSubarraySum(arr, arr.length, k);
        System.out.println("longest sub array: "+ c);
    }
}
