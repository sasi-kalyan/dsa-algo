import java.util.Scanner;

public class CodeForces0004 {

    public static int solution(int[] ba){

        int maxb = 0, j = 0;

        for(int i=0;i<ba.length;i++){
            if(ba[i]==0){
                j++;
                maxb = Math.max(maxb, j);
            }else{
                j = 0;
            }
        }

        return maxb;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0){
            int az = sc.nextInt();
            int[] arr = new int[az];

            for(int i = 0; i < az; i++){
                arr[i] = sc.nextInt();
            }

            int ans = solution(arr);
            System.out.println(ans);
        }
    }
}
