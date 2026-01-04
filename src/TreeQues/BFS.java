package TreeQues;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private class Node {
        int data;
        Node left;
        Node right;
    }

    static Node root;

    public static void main(String[] args) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            Node node = q.remove();
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
            System.out.println(node.data);
        }
    }
}
