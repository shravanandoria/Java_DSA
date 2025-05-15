package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human(22, "Shravan", 10000, false);
        Human person2 = new Human(34, "rohan", 20000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }

    static void func(){
        Main main = new Main();
        main.greeting();
    }

    void greeting() {
        func();
    }

}
