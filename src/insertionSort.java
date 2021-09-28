import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 4, 59, -9, 34, 0};

        insetionsort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("Mission complete");

    }

    public static void insetionsort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while((j >= 0 && arr[j] > key)){
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
    }


}
