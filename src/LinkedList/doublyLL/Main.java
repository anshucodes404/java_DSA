package LinkedList.doublyLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(90);
        list.insertFirst(34);
        list.insertLast(99);
        list.insert(99, 57);
//        list.insertLast(55);
//        list.insert(78, 2);
        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(78));
    }
}
