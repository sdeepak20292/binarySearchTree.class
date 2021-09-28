public class binaryTree {
    TreeNode root;

    public void inordertransverseTree(TreeNode node){  // transversal........
        if(node != null){
            inordertransverseTree(node.left);
            System.out.println(node.key);
            inordertransverseTree(node.right);
        }
    }

    public void preoderTranversal(TreeNode node){
        if(node != null){
            System.out.println(node.key);
            preoderTranversal(node.left);
            preoderTranversal(node.right);
        }
    }

    public void postOrderTransversal(TreeNode node){
        if(node != null){
            postOrderTransversal(node.left);
            postOrderTransversal(node.right);
            System.out.println(node.key);
        }
    }

    public int countNodes(TreeNode node){
          // we will count from the root level.
        if(node == null){
            return 0;
        }
        else{
            return 1 + countNodes(node.left) + countNodes(node.right);

        }


    }

    public int treeHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        return  1 + Math.max(treeHeight(node.left) , treeHeight(node.right));
    }  // node.left - acessing the left subtree.
    // node.right - accessing the right subtree.




    public static void main(String[] args){
        binaryTree bin = new binaryTree();
        TreeNode n1 = new TreeNode();
        TreeNode n2 = new TreeNode();
        TreeNode n3 = new TreeNode();
        TreeNode n4 = new TreeNode();
        TreeNode n5 = new TreeNode();
        n1.key = 1;
        n2.key = 2;
        n3.key = 3;
        n4.key = 4;
        n5.key = 5;   // tree formation from 13 - 23...
        bin.root = n1;
        bin.root.left = n2;
        bin.root.right = n3;
        bin.root.left.left = n4;
        bin.root.right.left = n5;
        bin.inordertransverseTree(n1);  // inorder transversal.....
        System.out.println();
        bin.preoderTranversal(n1); // preorder transversal......
        System.out.println();
        bin.postOrderTransversal(n1);  // postorder transversal.......
        System.out.println();
        System.out.println(bin.countNodes(n1));
        System.out.println();
        System.out.println(bin.treeHeight(n1));
    }

}
