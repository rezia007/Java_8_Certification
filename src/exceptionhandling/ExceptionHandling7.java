package exceptionhandling;

public class ExceptionHandling7 {
    public static void main(String[] args) {
        try {
            args = null;
            args[0] = "test";
            System.out.println(args[0]);
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException");
        }
    }
}

// Answer: compilation fails