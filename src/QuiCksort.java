public class QuiCksort {




    public static void quicksort(int[] arr, int l, int n){
        if(l < n){
            int p =partitionMid(arr, l, n);  // this method return the pivot index.
            quicksort(arr, l, p - 1);
            quicksort(arr, p + 1, n);

        }
    }

    public static int partitionMid(int[] arr, int l, int n){
        int mid = (l + n)/2;
        int pivot = arr[mid];
        int pIndex = l;
        for(int i = l; i <= n; i++){
            if(i == mid){
                continue;
            }

            if(arr[i] <= arr[mid]){
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

    public static void main(String[] args) {
//        System.out.println(divide(-2147483648
//                ,1));

        System.out.println(divide(-2147483648
                ,-3));


    }

    public static int divide(int dividend, int divisor){
        long quotient = 0;
        int sign = 1;
        long n1 = Math.abs((long)dividend);
        long n2 = Math.abs(divisor);
        boolean flag = true;



        if(n1 == n2){
            return 1;
        }
        if(n1 < 0){
            sign = -sign;
        }

        if(n2 < 0){
            sign = -sign;
        }

        if(divisor == 1){
            quotient = n1;
            flag = false;

        }


        while(flag){
            if(n1 < n2){
                flag = false;
            }

            else{
                n1 = n1 - n2;
                quotient ++;
            }

        }


        if(sign < 0){
            quotient = -quotient;
        }

        if(quotient > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }


        return (int)quotient;
    }




}
