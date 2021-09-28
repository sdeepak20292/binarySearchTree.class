public class LeetcodePractice {
    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for(int i = 0; i < nums.length; i += 1) {
            for(int j = i + 1; j < nums.length; j += 1) {
                if((nums[i] + nums[j]) == target){
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }

    return sum;
    }

    public static void main (String[] args) {
//        int[] arr = new int[]{27, 70, 91, 0, 3};
//
//        mergesort(arr, 0,  arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//
//        int[] narr = new int[]{761, 220 ,22, 34, 54, 67};
//        quicksort(narr, 0, narr.length - 1);
//        System.out.println(Arrays.toString(narr));
        System.out.println(inttoRoman(1994));

    }



    public static int fun(int m, int n){
        if(m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }
        return fun(n%m, m);
    }

    public static void mergesort(int[] arr, int l, int n){
        if(l < n){
            int mid = (n + l)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, n);
            merge(arr, l, n, mid);

        }
    }

    public static void merge(int[] arr, int l, int r, int m){
        int[] temp = new int[r + 1];
        int k = l;
        int i = l;
        int j = m + 1;
        while((i <= m) && (j <= r)){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;

            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k ++;
        }

        while(i <= m){
            temp[k] = arr[i];
            i ++;
            k ++;
        }

        while ( j <= r){
            temp[k] = arr[j];
            j ++;
            k ++;
        }

        for(int x = l; x <= r; x ++){
            arr[x] = temp[x];
        }
    }

    public static void quicksort(int[] arr, int l, int n){
        if(l < n){
            partition(arr, l, n);  // this method return the pivot index.
            quicksort(arr, l, partition(arr, l, n) - 1);
            quicksort(arr, partition(arr, l, n) + 1, n);

        }
    }

    public static int partition(int [] arr, int l, int n){
        int pivot = arr[n];
        int pIndex = l;
        for(int i = l; i < n; i++){
            if(arr[i] <= arr[n]){
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                pIndex ++;
            }
        }

        int temp = arr[pIndex];
        arr[pIndex] = arr[n];
        arr[n] = temp;

        return pIndex; // pivot index.

    }

    public static String inttoRoman(int number){
        String equivalent = "";
        while(number > 0){
            if(number >= 1000){
                number = number - 1000;
                equivalent += "M";

            }

            else if((number >= 900) &&(number < 1000)){
                number = number - 900;
                equivalent += "CM";
            }

            else if(number >= 500){
                number = number - 500;
                equivalent += "D";
            }

            else if((number >= 400) &&(number < 500)){
                number = number - 400;
                equivalent += "CD";
            }

            else if(number >= 100){
                number = number - 100;
                equivalent += "C";
            }

            else if((number >= 90)&&(number < 100)){
                number = number - 90;
                equivalent += "XC";
            }

            else if (number >= 50){
                number = number - 50;
                equivalent += "L";
            }

            else if ((number >= 40) && (number < 50)){
                number = number - 40;
                equivalent += "XL";
            }

            else if(number >= 10){
                number = number - 10;
                equivalent += "X";

            }

            else if((number == 9)){
                number = 0;
                equivalent += "IX";
            }

            else if(number >= 5){
                number = number - 5;
                equivalent += "V";
            }

            else if(number == 4){
                number = 0;
                equivalent += "IV";
            }

            else if(number < 4){
                equivalent += "I".repeat(number);
                number = 0;

            }
        }
        return equivalent;
    }

    public static int partitionMid(int[] arr, int l, int mid, int n){
        int pivot = arr[(l + n)/2];
        int pIndex = l;
        for(int i = l; i <= n; i++){
            if(i == mid){
                continue;
            }
            else if(arr[i] <= arr[mid]){
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                pIndex ++;

            }
        }

        int temp = arr[pIndex];
        arr[pIndex] = arr[mid];
        arr[mid] = temp;
        return pIndex;
    }



}
