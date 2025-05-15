package OOPS.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square square = new Square();

        Shapes obj = new Circle();
        obj.printMe();
        Shapes.printMe();
    }
}
