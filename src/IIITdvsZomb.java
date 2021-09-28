import java.util.Scanner;
import java.util.Stack;

public class IIITdvsZomb {


//    public static void quickSort(int[] arr, int s, int e){
//        if(s < e){
//            int p = partition(arr, s, e);
//            quickSort(arr, s, p - 1);
//            quickSort(arr, p + 1, e);
//        }
//    }
//
//    public static int partition(int[] arr, int s, int e){
//        int pivot = arr[e];
//        int pIndex = s;
//        for(int i = s; i < e; i ++){
//            if(arr[i] <= pivot){
//                int temp = arr[pIndex];
//                arr[pIndex] = arr[i];
//                arr[i] = temp;
//                pIndex ++;
//
//            }
//
//
//        }
//        int temp = arr[pIndex];
//        arr[pIndex] = arr[e];
//        arr[e] = temp;
//        return pIndex;
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int[][] arr = new int[t][2];
//        for(int i = 0; i < t; i ++){
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//            arr[i][0]  = A;
//            arr[i][1] = B;
//        }
//
//
//
//        for(int j = 0; j < arr.length; j++){
//            double large = Integer.MIN_VALUE;
//
//            int a = arr[j][0];
//            int b = arr[j][1];
//            for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
//                double sum = Math.ceil((b - i) / (double)2) + Math.ceil((i - a) / (double)2);
//                if (sum >= large) {
//                    large = sum;
//                }
//            }
//            System.out.println((int)large);
//        }
        System.out.println(isValid("["));
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        boolean flag = true;
        if((s.length() == 0) || (s.length() == 1)){
            flag = false;
        }


        for(int i = 0; i < s.length(); i++){
            Character current = s.charAt(i);

            if(!flag){
                break;
            }

            else if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }

            else if(current == '['){
                stack.push(current);
            }

            else if(current == '{'){
                stack.push(current);
            }

            else if(current == ')'){
                if(stack.empty()){
                    flag = false;
                }
                else{
                    flag = stack.pop() == '(';

                }
            }
            else if(current == ']'){
                if(stack.empty()){
                    flag  = false;
                }
                else{
                    flag = stack.pop() == '[';
                }
            }
            else if(current == '}'){
                if(stack.empty()){
                    flag = false;
                }

                else{
                    flag = stack.pop() == '{';
                }
            }


        }

        return flag;
    }
}
