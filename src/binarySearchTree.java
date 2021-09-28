import java.util.Stack;

public class binarySearchTree {
    TreeNode root;


    public void inorder(TreeNode node){
        if(node != null){
            inorder(node.left);
            System.out.println(node.key);
            inorder(node.right);
        }

    }

    public void preorder(TreeNode node){
        if(node != null){
            System.out.print(node.key);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(TreeNode node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.key+" ");
        }
    }

    // inorder successor and precedor.

    // to find the inorder successor of a node - we find the leftmost value in the node's right subtree.
    // meaning the value just bigger that the node - (go to right, then extreme left)
    public TreeNode inorderSucessor(int data){
        TreeNode temp = root;    // reference for the target node.
        while(true){
            if(temp.key == data){

                break;
            }
            else{
                if(temp.key < data){
                    temp = temp.right;
                }
                else{
                    temp = temp.left;
                }
            }
        }

        TreeNode sucessor = new TreeNode();

        // now to find the inorder sucessor of the node temp;
        if(temp.right != null) {  // checking whethe the node has right subtree.
            sucessor = temp.right;  // first right/

            if (sucessor.left != null) {
                while (sucessor != null) {
                    sucessor = sucessor.left;  // the extreme left
                }
            }
        }
        else{
            TreeNode successor = new TreeNode(); // null value.
            TreeNode ancestor = root;
            while(ancestor != temp){
                if(temp.key < ancestor.key){
                    temp = ancestor;
                    ancestor = ancestor.left;
                }
                else{
                    ancestor = ancestor.right;
                }

            }
        }
        return sucessor;
    }



    public TreeNode creatNode(int data){
        TreeNode node = new TreeNode();
        node.key = data;
        node.left = null;
        node.right = null;
        return node;
    }

    public TreeNode insert(TreeNode root, int data){
        if(root == null){
            return creatNode(data);
        }
        if(data < root.key){
            root.left = insert(root.left, data);
        }

        else{
            root.right = insert(root.right, data);
        }
        return root;

    }


    public int smallest(TreeNode node){
        if(node.left == null){
            return node.key;
        }
        return smallest(node.left);
    }

    public TreeNode delete(TreeNode root, int data){
        if(root == null){
            return root;
        }
        else if(data < root.key){
            root.left = delete(root.left, data);
        }
        else if(data > root.key){
            root.right = delete(root.right, data);
        }
        else{
            if(root.left == null || root.right == null){

               TreeNode temp = new TreeNode();
               temp = root.left == null ? root.right : root.left;
               if(temp == null){
                   return null;

                    } /// case, when node has 0 or 1 child nodes.
                else{

                    if(root.left == null){
                        return root.right;
                    }
                    else{
                        return root.left;
                    }

               }

            }
            else{
                TreeNode succ = inorderSucessor(root.key);
                root.key = succ.key;
                root.right = delete(root.right, succ.key);
                return root;
                // this will delete the inorder successor.
            }

        }
        return root;


    }

    public int sum(TreeNode node){
        if(node != null){
            if(node.left == null && node.right == null){
                return node.key + sum(node.left) + sum(node.right);
            }


        }
        return 0;


    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        else{
            return 1 + Math.max(height(node.left), height(node.right));

        }

    }


    public int minvalue(TreeNode node) {  // to find min value
        TreeNode current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        int min = current.key;
        delete(root, current.key);


        return (min);
    }

    public int maxValue(TreeNode node)  // to find max value.
    {
        /* loop down to find the rightmost leaf */
        TreeNode current = node;
        while (current.right != null)
            current = current.right;

        int max = current.key;
        delete(root, current.key);


        return (max);
    }

    public int getfullCount(TreeNode root)
    {
        if (root == null)
            return 0;

        int count = 0;
        if (root.left != null && root.right != null)
            count++;

        count += (getfullCount(root.left) + getfullCount(root.right));
        return count;
    }

    public int[] ArrInorder(TreeNode root)
    {
        // create an empty stack
        Stack<TreeNode> stack = new Stack<TreeNode>();

        int[] arr = new int[getfullCount(root)];
        int i = 0;

        // start from the root node (set current node to the root node)
        TreeNode current = root;

        // if the current node is null and the stack is also empty, we are done
        while (!stack.empty() || current != null)
        {
            // if the current node exists, push it into the stack (defer it)
            // and move to its left child
            if (current != null)
            {
                stack.push(current);
                current = current.left;
            }
            else {
                // otherwise, if the current node is null, pop an element from
                // the stack, print it, and finally set the current node to its
                // right child
                current = stack.pop();
                arr[i++] = current.key;
                current = current.right;
            }
        }
        return arr;
    }

    public int getMedianElement(TreeNode root){

        int[] inorderArr = ArrInorder(root);
        int medianIndex = getfullCount(root)/2 + 1;
        int median = inorderArr[medianIndex];
        delete(root, median);

        return inorderArr[medianIndex];
    }

    public int getKth(TreeNode root, int k){
        int[] inorderArr = ArrInorder(root);
        int Element = inorderArr[k + 1];
        delete(root, Element);
        return Element;
    }







    public static void main(String[] args){

        binarySearchTree bin = new binarySearchTree();
        TreeNode rootNode = bin.root;
        rootNode = bin.insert(rootNode,11);
        rootNode = bin.insert(rootNode,12);
        rootNode = bin.insert(rootNode,13);
        rootNode = bin.insert(rootNode,14);
        rootNode = bin.insert(rootNode,15);
        rootNode = bin.insert(rootNode,16);
        rootNode = bin.insert(rootNode,17);

        rootNode = bin.insert(rootNode,19);


        bin.postorder(rootNode);


    }

}
