package TreeQues;
import java.util.Queue;
import java.util.LinkedList;
public class FindSuccessor {
    public static void main(String[] args) {

    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    public TreeNode findSuccessor(TreeNode root, int key){
        if (root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int curr_lev_size = q.size();
            for(int i = 0; i < curr_lev_size; i++){
                TreeNode node = q.poll();
                if(node.left != null) {
                    q.offer(node.left);
                };
                if(node.right != null){
                    q.offer(node.right);
                }
                if(node.val == key) return q.poll();
            }

        }
        return null;
    }
}
