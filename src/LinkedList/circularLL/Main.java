package LinkedList.circularLL;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(44);
        list.insert(78);
        list.insert(20);
        list.insert(58);
        list.insert(12);
        list.insert(90);
        list.display();
        list.delete(44);
        list.delete(77);
        list.display();
        list.delete(20);
        list.display();
    }
}
