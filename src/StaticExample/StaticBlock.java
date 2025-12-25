package StaticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    static { //will only run once when first object is created
        System.out.println("First time the object has been loaded");
        b = a * 2;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // 4 8

        StaticBlock.b += 5;
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // 4 13

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // 4 13 //"b" value does not change when second object
        //is created because static block runs only when first object is created

    }
}
