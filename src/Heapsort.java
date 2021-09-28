import java.util.Arrays;
import java.util.Scanner;

public class Heapsort {
    public int[] arr;
    public int l;
    public int s;
    public int m;

    public Heapsort(int[] array){
        sort(array);
        this.arr = array;
        this.l = arr.length - 1;
        this.s = 0;
    }

    public int getLargest(){
        int largest = this.arr[l];
        l -= 1;
        return largest;
    }

    public int getSmallest(){
        int smallest = this.arr[s];
        s += 1;
        return smallest;
    }

    public int getMedian(){
        // swap the median element.
        int median = ((l - s) + 1)/2;
        int med = arr[median];

        for(int i = median; i > s; i --){
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        s += 1;
        return med;  // median id;
    }


    

    public void sort(int[] arr){
        int n = arr.length;
        for(int i = (n/2 - 1); i >= 0; i--){
            heapify(arr, i, n);
        }
        // for building max heap.

        for(int i = n - 1; i > 0; i--){  // for sorting in ascending order.
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }

    }

    public void heapify(int[] arr, int i, int n){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, -9, 7, 8, -3, 0};
        // array formation..
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i ++){
            int k = sc.nextInt();
            arr[i] = k;
        }


        Heapsort h = new Heapsort(arr);


        System.out.println(Arrays.toString(h.arr));
        System.out.println(h.getMedian());
        System.out.println(Arrays.toString(h.arr));

        System.out.println(h.getLargest());
        System.out.println(h.getLargest());
        System.out.println(h.getMedian());
        System.out.println(Arrays.toString(h.arr));
    }
}
