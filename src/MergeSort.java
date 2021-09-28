

public class MergeSort {
    public static void main(String[] args) {
//        int[] array = new int[]{1122, 8230, 9, 930, 23, 39};
//
//        quickSort(array, 0, array.length - 1);
//        System.out.println(Arrays.toString(array));
//        int[] newarr = new int[]{1, 40, 32, 409, 89};
//        quickSort(newarr, 0, newarr.length - 1);
//        System.out.println(Arrays.toString(newarr));
        int n = 8;
        for(int i = n / 2; i<= n; i ++){
            System.out.println(i);
        }



        
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

//    public static void merge(int[] arr, int l, int m, int r)
//    {
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        /* Create temp arrays */
//        int[] L = new int [n1];
//        int[] R = new int [n2];
//
//        /*Copy data to temp arrays*/
//        for (int i=0; i<n1; ++i)
//            L[i] = arr[l + i];
//        for (int j=0; j<n2; ++j)
//            R[j] = arr[m + 1+ j];
//
//
//        /* Merge the temp arrays */
//
//        // Initial indexes of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < n1 && j < n2)
//        {
//            if (L[i] <= R[j])
//            {
//                arr[k] = L[i];
//                i++;
//            }
//            else
//            {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        /* Copy remaining elements of L[] if any */
//        while (i < n1)
//        {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        /* Copy remaining elements of R[] if any */
//        while (j < n2)
//        {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }


    // Main function that sorts arr[l..r] using
    // merge()

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

    // QUICK SORT
    public static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int pIndex = s;
        for(int i = s; i < e; i ++){
            if(arr[i] <= pivot){
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                pIndex ++;

            }


        }
        int temp = arr[pIndex];
        arr[pIndex] = arr[e];
        arr[e] = temp;
        return pIndex;

    }

    public static void quickSort(int[] arr, int s, int e){
        if(s < e){
            int p = partition2(arr, s, e);
            quickSort(arr, s, p - 1);
            quickSort(arr, p + 1, e);
        }
    }
    // quick sort is better than merge sort in terms of space complexity. But merge sort for time complexity.

    ;
    public static int partition2(int[] arr, int s, int e){
        // sorting using pivot as first element.
        int pivot = arr[s];
        int pIndex = s;
        for(int i = s + 1; i <= e; i++){
            if(arr[i] <= pivot){
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                pIndex ++;
            }
        }

        return pIndex;
    }
}
