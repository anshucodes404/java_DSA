package trees;


public class Main {
      public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Binary_Tree tree ==  new Binary_Tree();
//        tree.populate(sc);
//        tree.display();
//        tree.prettyDisplay();

          BinarySearchTree bst = new BinarySearchTree();
          int[] nums = {3, 5, 8, 12, 56, 1, 6};
          bst.populate(nums);
          bst.display();
    }
}
