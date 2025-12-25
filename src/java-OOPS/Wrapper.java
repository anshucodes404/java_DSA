package OOP;

import static Message.MessagePrint.message;

public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        Integer num1 = 23;
        Integer num2 = 83;


        

        // swap(a, b);
        // System.out.println(a + " " + b); not swapping b/c here pass by value is being performed

        // swapInteger(num1, num2);
        // System.out.println(num1 + " " + b); not swapping b/c Integer is of final class
        //final is a keyword used to not let modify

        final int bonus = 45;
        // bonus = 78; can't re-assign the final keyword of primitives
       //final in objects
         final A anshu = new A("anshu");
         anshu.name = "other student"; //can do change the value but can't re assign with other object
        //  anshu = new A("manash");




        //garbage collection
        A obj;
        for(int i = 1; i < 100000000; i++){
            obj = new A("Random name" + i);
            System.out.println(i);
        }


        message();
        
    
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swapInteger(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    
}


class A{
    final int num = 46;
    String name;


    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
