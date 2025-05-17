package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try {
            divide(a,b);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("function ran");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Don't divide by zero");
        }

        return a / b;
    }
}
