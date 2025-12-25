package interfaces.nestedInterface;

public class A {
    //nested interface can be declared as private, public or default but top level must be public or default
    public interface nested{
        boolean isOdd(int n);
    }
}

class B implements A.nested{
   public boolean isOdd(int n){
       return (n & 1) == 1;
   }
}

class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(5));
    }
}