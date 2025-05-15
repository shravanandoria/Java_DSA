package OOPS;

import OOPS.Properties.Encapsulation.A;

public class Introductions extends A {

    public Introductions(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {

        Introductions obj = new Introductions(22, "ss", new int[]{2});
        int a = obj.num;

//        Student student1 = new Student();
//        System.out.println(student1.name);
//        System.out.println(student1.rno);
    }

}

class Student {
    int rno;
    String name;

    Student() {
        this.rno = 22;
        this.name = "Shravan Andoria";
    }

}
