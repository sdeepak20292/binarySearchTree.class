import java.util.Scanner;

public class ballons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }

        int countWays = 0;

        int start = 0;
        int end = n - 1;
        while(start < end){
            int sum = 0;
            for(int i = start; i <= end; i ++){
                sum += arr[i];
            }

            if(sum == k){
                countWays ++;

            }

            else{
                if(arr[start] >= arr[end]){
                    start ++;
                }
                if(arr[end] > arr[start]){
                    end --;
                }
            }

        }

        start = 0;
        end = n - 1;

        while(start < end){
            int sum = 0;
            for(int i = start; i <= end; i ++){
                sum += arr[i];
            }
            if(sum == k){
                countWays ++;

            }
            else{
                if(arr[start] <= arr[end]){
                    start ++;
                }
                if(arr[end] < arr[start]){
                    end --;
                }
            }

        }
        System.out.println(countWays);
    }
}
