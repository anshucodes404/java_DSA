package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human anshu = new Human(18, "Anshu Kumar", 'M');
        Human manash = new Human(19, "Manash", 'F');

        System.out.println(anshu.population);
        System.out.println(manash.population);

//        greeting();
    }

    //This is not dependent on objects / instances of class
    static void fun(){
//        greeting(); cannot access but there is a way in which you can i.e. via referencing instance

        Main obj = new Main();
        obj.greeting();
    }

    //This is dependent on instances of objects
    void greeting(){  //can't use inside non-static
        System.out.println("Hello Anshu!!");
    }
}
