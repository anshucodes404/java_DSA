package StaticExample;

class Test{
   static String name;
    public Test(String name){
        Test.name = name;
    }
}
public class InnerClass {


    public static void main(String[] args) {
        Test obj = new Test("Anshu");
        Test obj2 = new Test("Manash");

        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}
