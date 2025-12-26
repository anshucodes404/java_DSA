package trees;

public class AVL {

    public static class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0; // leaf height = 0
        }

        public int getValue() {
            return value;
        }

    }

    private Node root;

    public AVL() {

    }

    public int height(){
        return height(root);
    }

    public int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null)
            return;
        System.out.println(details + node.getValue());
        display(node.left, "Left Child of " + node.getValue() + " : ");
        display(node.right, "Right Child of " + node.getValue() + " : ");
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node){
        int balance = height(node.left) - height(node.right);

        if (balance > 1) {
            // left heavy
            if (height(node.left.left) - height(node.left.right) >= 0) {
                // left-left
                return rightRotate(node);
            } else {
                // left-right
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        } else if (balance < -1) {
            // right heavy
            if (height(node.right.left) - height(node.right.right) <= 0) {
                // right-right
                return leftRotate(node);
            } else {
                // right-left
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node node){
        Node p = node.right;
        Node t = p.left;

        node.right = t;
        p.left = node;

        // updating the heights (fix: +1 applied after Math.max)
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }

    private Node rightRotate(Node node){
        Node c = node.left;
        Node t = c.right;

        c.right = node;
        node.left = t;

        // updating the heights
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null)
            return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;
        System.out.println(node.getValue() + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.getValue() + " ");
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.getValue() + " ");
        inOrder(node.right);
    }

}