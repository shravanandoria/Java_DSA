package OOPS.Properties.Encapsulation;

public class SubClass extends A{

    public SubClass(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {
        A obj = new A(22, "shravan", new int[]{2});
        int a = obj.num;
        System.out.println(a);
    }
}
