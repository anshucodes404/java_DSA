package Generics.ComparingObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student anshu = new Student("Anshu", 57.90f);
        Student manash = new Student("Manash", 90.29f);
        Student ayush = new Student("Ayush", 91.29f);
        Student mona = new Student("Mona", 90.90f);
        Student apurba = new Student("Apurba", 30.10f);
        Student prince = new Student("Prince", 78.90f);

        Student[] list = {anshu, manash, ayush, mona, apurba, prince};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(anshu.compareTo(manash) > 0){
//            System.out.println("Anshu has more marks");
//        } else {
//            System.out.println("Manash has more marks");
//        }
    }
}
