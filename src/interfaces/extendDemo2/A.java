package interfaces.extendDemo2;

public interface A {

    //static interface method
    static void fun() {
        System.out.println("I am a static method of interface A");
    }

    //default keyword used if then no need to re-define it in main
    default void greet() {
        System.out.println("I am a default method of interface A");
    }
}
