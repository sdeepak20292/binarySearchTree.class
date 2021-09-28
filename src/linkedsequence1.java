import java.util.LinkedList;
import java.util.Scanner;

public class linkedsequence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> arr = new LinkedList<Integer>();
        arr.add(1);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int n1 = sc.nextInt();
            if(n1 == 1){
                int n2 = sc.nextInt();
                arr.add(n2);
            }
            if(n1 == 2){
                for(int j = 0; j < arr.size(); j++){
                    System.out.print(arr.get(j)+" ");
                }
            }

            if(n1 == 3){
                if(arr.size() == 1){
                    System.out.println(arr.get(0));
                }
                else if(arr.size() % 2 == 0){
                    System.out.println(arr.get(arr.size()/2 - 1));
                }

                else{
                    System.out.println(arr.get(arr.size()/2));
                }
            }

            if(n1 == 4){
                int n2 = sc.nextInt();
                if (arr.size() % 2 == 0){
                    arr.add(arr.size() / 2 ,n2);
                }
                else{
                    arr.add(arr.size()/2 + 1, n2);
                }
            }


//            else{
//                int n2 = sc.nextInt();
//                if(n1 == 1){
//                    arr.add(n2);
//
//                }
//
//                else if(n1 == 2){
//                    arr.remove(n2 - 1);
//                }
//
//                else if(n1 == 4){
//                    int n3 = sc.nextInt();
//                    arr.add(n2 - 1, n3);
//                }
//
//
//            }

        }
    }


}
