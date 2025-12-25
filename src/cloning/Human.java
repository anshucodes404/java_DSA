package cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{2, 4, 6, 1, 8, 9};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

//    public Object clone() throws CloneNotSupportedException{
//        //this is shallow copy
//        return super.clone();
//    }
    public Object clone() throws CloneNotSupportedException{
        //this is deep copy
        Human twin = (Human)super.clone();

        //making a deep copy
        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];

        }
        return twin;
    }
}
