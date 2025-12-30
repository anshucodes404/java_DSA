package trees;

public class SegmentTrees {
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    public SegmentTrees(int[] arr){
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = "";
        //for left node
        if(node.left != null){
            str = str + " Idx range [ " + node.left.startInterval + " - " + node.left.endInterval + " ] and data is: " + node.left.data;
        } else {
            str = str + " No left child";
        }

        //for current node
        str = str + " Idx range [ " + node.startInterval + " - " + node.endInterval + " ] and data is: " + node.data;

        //for right node
        if(node.right != null){
            str = str + " Idx range [ " + node.right.startInterval + " - " + node.right.endInterval + " ] and data is: " + node.right.data;
        } else {
            str = str + " No right child";
        }
        System.out.println(str);
        //now recursion
        if(node.left != null) display(node.left);
        if(node.right != null) display(node.right);
    }

    //query
    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node.startInterval <= qsi && node.endInterval >= qei) return node.data;
        else if(node.startInterval > qei || node.endInterval < qsi) return 0;
        else return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
    }

    //update
    public void update(int idx, int value){
        update(this.root, idx, value);
    }

    private void update(Node node, int idx, int value){
        if(idx > node.endInterval) return;
        if(node.startInterval == idx && node.endInterval == idx ){
            node.data = value;
            return;
        }
        if(idx <= node.left.endInterval){
            update(node.left, idx, value);
        } else update(node.right, idx, value);

        node.data = node.left.data + node.right.data;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 10, 12};
        SegmentTrees tree = new SegmentTrees(arr);
        tree.display();
        tree.update(2, 10);
        tree.display();
    }
}
