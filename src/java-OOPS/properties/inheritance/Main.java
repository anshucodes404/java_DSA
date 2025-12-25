package OOp.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.0, 8.6, 9.3);
//        Box box2 = new Box(box1);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(4.6, 2.6, 9.0, 7.3);
//
//        System.out.println(box3.h + " " + box3.weight);
//
//        System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        Box box5 = new BoxWeight(2.5, 6.8, 1.8, 5.6);
        System.out.println(box5.l);
//        System.out.println(box5.weight);  can't access weight because box5 is a reference
        // variable of type Box and weight is a property of child class

//        BoxWeight box6 = new Box(2, 3, 7);  can't do this because BoxWeight is a child class of Box
//        class.
        //This is not correct because to access a variable, it must be initialised first and when making a parent class object, it has no idea of
        //variables of child class. So giving an error
        Box box7 = new BoxWeight(2, 3, 7, 8);
        System.out.println(box7.w);
//        System.out.println(box7.weight); can't access weight because it is not in the Box class, and it is a parent of the class having weight
    }
}
