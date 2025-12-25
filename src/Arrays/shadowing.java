public class shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; //Available in only this method scope . this is called shadowing it covers up the global x 
        // int x; //declaration
        //Shadowing works after intiliasing a variable not just declaring it
        // x = 40; //initialasation
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
