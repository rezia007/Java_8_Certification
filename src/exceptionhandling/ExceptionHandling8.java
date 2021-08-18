package exceptionhandling;

public class ExceptionHandling8 {
    public void method1() {
        B b = new B();
        b.method2();
    }

    public static void main(String[] args) {

        try {
            ExceptionHandling8 a = new ExceptionHandling8();
            a.method1();
        } catch (Exception e) {
            System.out.println("an error occurred");

        }


    }

    public class B {
        public void method2() {
            C c = new C();
            c.method3();
        }
    }

    public class C {
        public void method3() {
            NullPointerException e;
        }
    }
}
// Answer: The code on line 29 will be executed
// the exception will be propagated back to line 27