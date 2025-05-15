package OOPS.Properties.Polymorphism;

public class Circle extends Shapes{

    static void printMe() {
        System.out.println("Inside Circle class");
    }

    @Override
    void area(){
        System.out.println("2 pie r^2");
    }
}
