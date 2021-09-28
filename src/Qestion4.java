public class Qestion4 {

    public static boolean ifValidTeam(TreeNode node, TreeNode a, TreeNode b){
        if(node == null || a == null || b == null){
            return false;
        }

        if(getLevel(node, a.key, 1) != getLevel(node, b.key, 1)){
            return false;
        }

        boolean valid =  !ifSiblings(node, a, b);
        if(valid){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        return valid;
    }

    public static  int getLevel(TreeNode node, int key, int currentLevel){
        if(node == null){
            return 0;
        }

        if(node.key == key){
            return currentLevel;
        }

        int level = getLevel(node, key, currentLevel + 1);
        if(level != 0){
            return level;
        }

        level = getLevel(node, key, currentLevel + 1);
        return level;
    }

    public static  boolean ifSiblings(TreeNode node, TreeNode a, TreeNode b){
        if(node == null){
            return false;
        }

        return ((node.right == a && node.left == b) || (node.left == a && node.right
        == b) || (ifSiblings(node.left, a, b)
        || ifSiblings(node.right, a, b)));
    }



    
}
