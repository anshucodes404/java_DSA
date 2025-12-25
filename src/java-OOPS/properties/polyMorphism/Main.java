package OOp.properties.polyMorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        circle.area();
       //area method in Circle will execute not one in the Shapes
    }
}
