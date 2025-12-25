package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a, b);
            String name = "Anshu";
            if(name.equals("Anshu")){
                throw new MyException("Name is Anshu"); //calling own structure
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){ //catches anything goes wrong
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
