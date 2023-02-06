package example.spotbugs;

public class MyClassSpotbugs {
    public void myMethod(String x) {
        if (x == null) { // This check should be reported as redundant as "x" is nonnull
            System.out.println("x is null");
            return;
        }
        System.out.println("x is not null");
    }
}
