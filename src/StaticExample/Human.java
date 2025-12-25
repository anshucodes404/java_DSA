package StaticExample;

public class Human {
    int age;
    String name;
    char gender;
    static int population;

    static void message(){
        System.out.println("Hello World!!");
//        System.out.println(this.age);  //can't use this here because it will refer to an object of Human class but message will not require any object
    }

    public Human(int age, String name, char gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
        Human.population += 1;
    }
}
