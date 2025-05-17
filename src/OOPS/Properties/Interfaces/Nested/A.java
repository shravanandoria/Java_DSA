package OOPS.Properties.Interfaces.Nested;

public class A {
    public interface Nested {
        boolean isOdd(int a);
    }
}

class B implements A.Nested {
    @Override
    public boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
