package interfaces.extendDemo2;

public class Main implements A, B {

    @Override
    public void fun() {
        System.out.println("I am fun of B in Main class");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        //to call static method of interface A class
        A.fun();
    }
}
