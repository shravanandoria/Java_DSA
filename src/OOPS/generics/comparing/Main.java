package OOPS.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Student shravan = new Student(22, 88);
//        Student rahul = new Student(12, 94);
//
//        if(shravan.compareTo(rahul) < 0) {
//            System.out.println("Rahul has more marks");
//        }
        Student shravan = new Student(22, 81);
        Student rahul = new Student(22, 89);
        Student abhishek = new Student(22, 79);
        Student pinku = new Student(22, 88);
        Student rohan = new Student(22, 69);

        Student[] students = {shravan, abhishek, rahul, pinku, rohan};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(students));

    }
}
