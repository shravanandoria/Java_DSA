package OOPS.Properties.Abstraction;

public class Son extends Parent{

    Son(int age){
        super(22);
    }

    @Override
    void normal() {

    }

    @Override
    void career() {
        System.out.println("I am going to be a Engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }

}
