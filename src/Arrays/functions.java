import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        // sum();
       System.out.println(greet());
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int sum = a + b;
        System.out.println(sum);
    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }

}
