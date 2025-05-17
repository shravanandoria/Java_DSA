package OOPS.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human shravan = new Human(25, "shravan");

        Human twin = (Human)shravan.clone();
        System.out.println(twin.name + " " + twin.age);
    }
}
