package assertions;

public class AssertionJava01 {
    public static void main(String[] a) {
        try {
            assert a.length == 1;

        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}
