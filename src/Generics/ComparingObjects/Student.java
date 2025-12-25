package Generics.ComparingObjects;

public class Student implements Comparable<Student>{
    String name;
    float marks;

    public Student(String name,float marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
