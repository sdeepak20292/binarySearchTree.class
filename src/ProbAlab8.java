import java.util.Scanner;

public class ProbAlab8 {


    public static int CountnumTrees(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for(int i= 2; i < n + 1; i++){
            for(int j = 0; j < i; j++){
                arr[i] += arr[j] * arr[i - j - 1];
            }
        }

        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n; i ++){
            int k = sc.nextInt();
        }
        System.out.println(CountnumTrees(n));
    }


}
