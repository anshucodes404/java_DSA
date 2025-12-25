package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human anshu = new Human(18, "Anshu");
//        Human twin = new Human(anshu);
        Human twin = (Human)anshu.clone(); //cloning an object
        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(anshu.arr));

    }
}
