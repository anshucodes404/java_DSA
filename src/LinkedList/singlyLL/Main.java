package LinkedList.singlyLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(90);
        list.insertFirst(34);
        list.insertLast(55);
        list.insert(78, 2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(78));
        list.insertRec(38, 3);
        list.display();
        list.insertRec(44, 2);
        list.display();
        list.get(3);
    }
}
