package assertions;

public class AssertionJava02 {
    public static void main(String[] args) {
    }

        public void someMethod (Object value){
            if (value == null) {
                throw new IllegalArgumentException("value is null");
            }
            System.out.println(value.getClass());
        }
    }

