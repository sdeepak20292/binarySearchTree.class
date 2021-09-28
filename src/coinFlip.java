import java.util.ArrayList;

public class coinFlip {

    public static void minimumFlips(ArrayList<Integer> arr, int i){

        if(i == arr.size() - 1){
            return;
        }

        minimumFlips(arr, i + 1);
        sortCoins(arr, i + 1);

    }

    public static void sortCoins(ArrayList<Integer> arr, int i){
        int[] temp = new int[i + 1];

        int maxElement = arr.get(0);
        int index;
        for(int j = 0; j <= i; j++){
            if (arr.get(j) >= maxElement){
                maxElement = arr.get(j);
            }
        }
        index = arr.indexOf(maxElement);

        int k = 0;
        int p = index;
        while(p > k){
            int te = arr.get(k);
            arr.set(k, arr.get(index));
            arr.set(index, te);
            k++;
            p--;
        }

        int z = 0;
        while(z < i){
            int pe = arr.get(z);
            arr.set(z, arr.get(i));
            arr.set(i, pe);
            i --;
            z ++;
        }

    }

    public static int maxElementIndex(ArrayList<Integer> arr, int i){
        int maxElement = arr.get(0);
        int index;
        for(int j = 0; j <= i; j++){
            if (arr.get(j) >= maxElement){
                maxElement = arr.get(j);
            }
        }
        return arr.indexOf(maxElement);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 9, 88};
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(8);
        arr2.add(3);
        arr2.add(1);
        arr2.add(9);


        System.out.println(arr2);

        minimumFlips(arr2, 0);
        System.out.println(arr2);
    }
}
