package OOPS.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return this.marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
