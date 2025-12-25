package OOP;

// import java.util.Arrays;

import static Message.MessagePrint.message;

public class Student {
    public void main(String[] args) {

        message();
        // data of 5 students
        // int[] roll = new int[5];
        // String[] name = new String[5];
        // int[] marks = new int[5];

        // Student[] students = new Student[5];

        // just declaring
        // Student student1;
        // student1 = new Student();

        // or in one line
        // StudentDetails student1 = new StudentDetails();
        // student1.changeDetails(45, "Manash", 34);
        // student1.greetings();
        // student1.changeDetailsThis(45, "Manash", 34);
        // student1.greetings();
        // // StudentDetails student2 = new StudentDetails(24051086, "Apurba Halder", 68);

        // StudentDetails rohan = new StudentDetails(student1);
        // rohan.greetings();



        // StudentDetails one = new StudentDetails(23, "one", 89);
        // StudentDetails two = one;
        // System.out.println(one.name);
        // two.name = "two";
        // System.out.println(one.name);


        StudentDetails random = new StudentDetails();
        System.out.println(random.name);




        // System.out.println(student2.roll);
        // System.out.println(student2.roll);
        // System.out.println(student2.marks);

        // constructor: StudentDetails() means it tells what happens after new object is
        // created

        // System.out.println(student1);
        // student1.roll = 24051085;
        // student1.name = "Anshu Kumar";
        // student1.marks = 98;
        // System.out.println(student1.roll);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);
        // default value of primitives are 0 and non-primitives to null

        // System.out.println(student1);
        // System.out.println(Arrays.toString(students));

        // doing same using classes

        // calling constructor from another constructor using this keyword
        // StudentDetails random = new StudentDetails();
        // System.out.println(random.name);
    }

}

class StudentDetails {
    int roll;
    String name;
    int marks;
    // if initial value is set something than on making new instance the initial
    // value will also be copied

    void greetings() {
        System.out.println("Good morning " + name);
    }

    StudentDetails(StudentDetails other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }

    void changeDetails(int roll, String name, int marks) {
        roll = roll;
        name = name;
        marks = marks;

    }

    void changeDetailsThis(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;

    }

    StudentDetails() {
        this(47, "default name", 58);
    }

    // own defined constructor
    StudentDetails(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
