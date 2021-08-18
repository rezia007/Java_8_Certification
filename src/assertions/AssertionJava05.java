package assertions;

public class AssertionJava05 {
    public static void main(String[] args) {
        assert(false);
    }
}
       /*
       * It is not appropriate to use assertions to validate command-line arguments.
       * It is appropriate to use assertions to generate alerts when reach code that should not be reachable.
       * It is not appropriate for assertions to change a program's state.
       */

