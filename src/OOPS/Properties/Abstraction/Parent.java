package OOPS.Properties.Abstraction;

public abstract class Parent {

    int age;

    Parent(int age) {
        this.age = age;
    }

    void normal(){
        System.out.println("hello");
    }

    abstract void career();
    abstract void partner();
}
