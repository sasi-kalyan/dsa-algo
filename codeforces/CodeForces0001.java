import java.util.*;

public class CodeForces0001 {

    static int solve(int[] arr, int n){

        List<Integer> seen = new ArrayList<>();
        seen.add(arr[0]);

        int c = 0;

        for(int i=1;i<n;i++){
            Collections.sort(seen);
            if(arr[i] < seen.get(0) || arr[i] > seen.get(seen.size() - 1)){
                seen.add(arr[i]);
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){arr[i] = sc.nextInt();}

        System.out.println(solve(arr, arr.length));

    }
}
