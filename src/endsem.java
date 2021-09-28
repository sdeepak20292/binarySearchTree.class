import java.util.ArrayList;

public class endsem {
    public static void main(String[] args){
        int[] arr=  new int[]{1, 3, 1, 3, 2, 2, 2};
        office(arr);
    }

    public static void office(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            ArrayList<Integer> count = new ArrayList<Integer>();
            ArrayList<Integer> seen = new ArrayList<Integer>();
            int highestYet = 0;

            for (int i = 0; i < j + 1 ; i++) {

                if (!seen.contains(arr[i])) {
                    seen.add(arr[i]);
                    count.add(1);
//                    highestYet = maxIndex(seen);

                }
                else {
                    int index = 0;

                    index = seen.indexOf(arr[i]);
                    count.set(index, count.get(index) + 1);
                    if (count.get(index) > count.get(highestYet)) {
                        highestYet = index;
                    }

                    if(count.get(index).equals(count.get(highestYet))){
                        if(seen.get(index) >= seen.get(highestYet)){
                            highestYet = index;
                        }
                    }

                }
            }
            System.out.println(seen.get(highestYet)
                    + " " + count.get(highestYet));
        }
    }

    public static int maxIndex(ArrayList<Integer> arr){
        int max=arr.get(0);
        for (Integer x : arr)
            if (x>max)
                max=x;
        return arr.indexOf(max);
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
