package exceptionhandling;

public class ExceptionHandling10 {
    static void test() throws RuntimeException {
        try {
        } catch (NullPointerException e1) {
            System.out.println("a");
        } catch (RuntimeException e2) {
            System.out.println("b");
        } finally {
            System.out.println("c");
        }
    }
}
// Answer: ac


