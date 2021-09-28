import java.util.Scanner;

public class aliceNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] velocities = new int[n];
        int[] positions = new int[n];
        for(int i = 0; i < n; i ++){
            velocities[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i ++){
            positions[i] = sc.nextInt();
        }

        int overtakes = 0;


        sort(velocities, 0, velocities.length - 1);






        System.out.println(overtakes);


        }

    public static void sort(int[] arr, int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            myMerge(arr, l, m, r);
        }
    }

    public static void myMerge(int[] arr, int l, int m, int r){
        int[] temp = new int[r + 1];
        int i = l;
        int j = m + 1;
        int k = l;
        while((i <= m)&&(j <= r)){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i ++;
            }
            else{
                temp[k] = arr[j];
                j ++;
            }
            k ++;
        }
        while(i <= m){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= r){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int p = l; p <= r; p++){
            arr[p] = temp[p];
        }
    }





}
