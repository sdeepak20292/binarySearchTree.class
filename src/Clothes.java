import java.util.ArrayList;
import java.util.Scanner;

public class Clothes {
    public static void main(String[] args) {
        // input take.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < n; i ++) {
            int k = sc.nextInt();
            arr.add(k);
        }

        int c = sc.nextInt();

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int j = 0; j < c; j ++) {
            int m = sc.nextInt();
            arr2.add(m);
        }


        for (int element : arr2) {
            if (arr.contains(element)) {
                int l = arr.indexOf(element) + 1;
                int r = l;
                if (arr.subList(l, arr.size() - 1).contains(element)) {
                    r = l + 1;
                }


                System.out.println(l + " " + r);
            } else {
                System.out.println(-1);
            }

        }


    }
}
