import java.util.ArrayList;
import java.util.List;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 0 ,1};

        System.out.println(range(arr));
    }




    public static void myMerge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r + 1];
        int i = l;
        int j = m + 1;
        int k = l;
        while ((i <= m) && (j <= r)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= r) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int p = l; p <= r; p++) {
            arr[p] = temp[p];
        }
    } // merge sort(my merge).

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            myMerge(arr, l, m, r);
        }
    } // sort

    public static boolean conatinnearby(int[] nums, int k, int t){
        int i = 0;
        boolean flag = false;
        while(i < nums.length - 1){
            if (i + k <= nums.length - 1){
                int j = i + k;


                for(int z = i + 1; z <= j; z++){
                    long check = (long)nums[i] - (long)nums[z];
                    if(check < 0){
                        check = - check;
                    }
                    if(check <= (long)t){
                        flag = true;
                        break;
                    }
            }
                i += k;



            }
            else {
                for(int x = i + 1; x < nums.length; x++){
                    long check = (long)nums[i] - (long)nums[x];
                    if(check < 0){
                        check = - check;
                    }
                    if(check <= t){
                        flag = true;
                        break;
                    }
                }
                i++;
            }

        }
        return flag;
    }

    public static List<Integer> majorityElement(int[] nums){
        List<Integer> l = new ArrayList<Integer>();
        sort(nums, 0, nums.length - 1);
        // creating an list to return.
        int count = 1;
        if((nums.length / 3) == 0){
            for (int num : nums) {
                if(!l.contains(num)){
                    l.add(num);

                }
            }


        }

        for(int j = 0; j < nums.length; j++){
            if(j != nums.length - 1){
                if(nums[j] == nums[j + 1]){
                    count ++;

                }
                else{
                    if(count > (nums.length / 3)){
                        l.add(nums[j]);
                    }

                    count = 1;


                }
            }
            else{
                if(nums[j - 1] == nums[j]){
                    if(count > (nums.length / 3)){
                        l.add(nums[j]);

                    }
                }
                count = 1;
            }




        }
        return l;


    }

    public static int range(int[] nums){
        int sum = 0;
        for (int num : nums) {
            sum = num + sum;
        }

    return (nums.length * (nums.length - 1))/2 - sum;
    }


}
