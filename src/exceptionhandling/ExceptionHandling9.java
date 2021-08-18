package exceptionhandling;

public class ExceptionHandling9 {
    static void test() throws RuntimeException {
        try {
            System.out.println("test ");
            throw new RuntimeException();
        } catch (Exception ex) {
            System.out.println("exception ");
        }
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (RuntimeException ex) {
            System.out.println("runtime ");
        }
        System.out.println("end ");
    }
}
//test exception end


