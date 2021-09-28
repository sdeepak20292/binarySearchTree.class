public class AVLBst {
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
            System.out.println(node.key);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(TreeNode node){
        if(node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.key+" ");
        }
    }

    public int height(TreeNode node){  // function for height;
        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int balancingFactor(TreeNode node){
        if(node == null){
            return 0;
        }
        return height(node.left) - height(node.right);  // will return the height of particular node
    }


    public TreeNode rightRotate(TreeNode node){
        TreeNode b = node.left;
        TreeNode t3 = b.right;
        b.right = node;
        node.left = t3;
        return b;  // new root;
    }

    public TreeNode leftRotate(TreeNode node){
        TreeNode b = node.right;
        TreeNode t2 = b.left;
        b.left = node;
        node.right = t2;
        return b;
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

        // LL CASE:

        if(balancingFactor(root) > 1 && data < root.left.key){
            return rightRotate(root);
        }

        // RR CASE:

        if(balancingFactor(root) < -1 && data > root.right.key){
            return leftRotate(root);
        }

        // LR CASE:

        if(balancingFactor(root) > 1 && data > root.left.key){
            TreeNode a = root.left;
            root.left = leftRotate(a);
            return rightRotate(root);
        }

        // RL CASE:

        if(balancingFactor(root) < -1 && data < root.right.key){
            TreeNode a = root.right;
            root.right = rightRotate(a);
            return leftRotate(root);
        }
//DONE COMPLETE CODE;


        return root;

    }


    public int smallest(TreeNode node){
        if(node.left == null){
            return node.key;
        }
        return smallest(node.left);
    }

    public static void main(String[] args) {
        TreeNode root;
        AVLBst avltree = new AVLBst();
        root = avltree.root;
        root = avltree.insert(root, 9);
        root = avltree.insert(root, 6);
        root = avltree.insert(root, 5);
        root = avltree.insert(root, 8);
        root = avltree.insert(root, 7);
        root = avltree.insert(root, 15);




    }


}
