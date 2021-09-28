import java.util.Scanner;

public class probA {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        binarySearchTree bin = new binarySearchTree();
        TreeNode root = bin.root;
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i < n; i ++){

            arr[i] = sc.nextInt();
        } // tree formation.


        for(int i = 0; i < arr.length; i ++){
            root = bin.insert(root, arr[i]);
        }



        bin.postorder(root);

    }




}
