public class Question7 {
    // distance of root node to a particular node

    public static int distance(TreeNode root, int data, int distance){
        if(root == null){  // if root is null, then return -1;
            return -1;
        }

        if(root.key == data || (distance = distance(root.right, data, distance + 1)) >= 1 ||
                (data = distance(root.right, data, distance + 1)) >= 1){
            return distance;
        }

        return -1;   // if the node not present.
    }



    // DISTANCE BETWEEN ANY TWO NODES IN A BINARY TREE

    public static int distanceBetweenTwoNodes(TreeNode root, int n1, int n2){
        if(root == null){
            return -1;
        }

        TreeNode LCA = findLCA(root, n1, n2);
        if(LCA == null){
            return -1;   // If the LCA dosenot exist, then return -1;
        }

        int dist1 = distanceFromAncestor(LCA, n1, 0);
        int dist2 = distanceFromAncestor(LCA ,n2, 0);
        return dist1 + dist2;   // distanc between the two nodes.
    }


    // LCA of two nodes.
    public static TreeNode findLCA(TreeNode root, int n1, int n2){
        if(root == null){
            return null;
        }

        if(root.key == n1 || root.key == n2){
            return root;
        }

        TreeNode left = findLCA(root.left, n1, n2);
        TreeNode right = findLCA(root.right, n1, n2);

        if (left != null && right != null){
            return root;
        }

        if(left == null && right == null){
            return null;
        }

        return left != null ? left : right;

    }

   // distance of a node from it's ancestor.
    public static int distanceFromAncestor(TreeNode node, int data, int dist){
        if(node == null){
            return -1;
        }

        if(node.key == data){
            return dist;
        }

        int d = distanceFromAncestor(node.left, data, dist + 1);

        if (d != -1) {
            return d;
        }

        d = distanceFromAncestor(node.right, data, dist + 1);

        return d;
    }





}
