import java.util.*;

public class probALab9 {

    public  static TreeNode constructFromPrePostOrder(int[] preOrder, int[] postOrder) {
        return ConstructBST(preOrder, postOrder, 0, preOrder.length-1, 0, postOrder.length-1);
    }

    private static  TreeNode ConstructBST(int[] pre, int[] post, int preStart, int preEnd, int postStart, int postEnd){
        if(preStart > preEnd || postStart > postEnd){
            return null;
        }

        int val = pre[preStart];
        TreeNode root = new TreeNode();

        //if this is single node
        if(preStart == preEnd){
            return root;
        }

        int index = findIndex(post, pre[preStart+1], postStart, postEnd);
        int diff = index - postStart;
        root.left = ConstructBST(pre, post, preStart+1, preStart+diff+1, postStart, index);
        root.right = ConstructBST(pre, post, preStart+diff+2, preEnd, index+1, postEnd-1);

        return root;
    }

    private static int findIndex(int[] postOrder, int target, int start, int end){
        int index = start;

        for(int i = start; i <= end; i++){
            if(postOrder[i] == target){
                index = i;
                break;
            }
        }

        return index;
    }

    public static List<List<Integer>> giveLevelOrder(TreeNode node){
        List<List<Integer>> resultList = new ArrayList<>();

        if(node == null){
            return resultList;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(node != null){
            queue.add(node);
        }

        while(!queue.isEmpty()){

            //Check the size of the queue (this is the most important step)
            int size = queue.size();

            //The list that keeps all the nodes at a level
            List<Integer> list = new ArrayList<Integer>();

            //Loop through the nodes of one level
            for(int i=0; i<size; i++){

                TreeNode node2 = queue.remove();
                list.add(node2.key);

                //Add left and right nodes if they are not null
                if(node2.left != null){
                    queue.add(node2.left);
                }

                if(node2.right != null){
                    queue.add(node2.right);
                }
            }
            //Finally add the level list to the result
            resultList.add(list);
        }
        return resultList;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] postorder = new int[n];

        for(int i = 0; i < n; i ++){
            int k = sc.nextInt();
            preorder[i] = k ;
        }
        System.out.println(Arrays.toString(preorder));

        for(int i = 0; i < n; i ++){
            int k = sc.nextInt();
            postorder[i] = k ;
        }

        System.out.println(Arrays.toString(postorder));

        TreeNode bstNode = new TreeNode();
        bstNode = constructFromPrePostOrder(preorder, postorder);
        List<List<Integer>> level = new ArrayList<>();
        level = giveLevelOrder(bstNode);

        for(int i = 0; i < level.size(); i ++){
            System.out.println(level.get(i));
        }



    }
}
