package exceptionhandling;

public class ExceptionHandling5 {
    static void test() throws Error{
        if(true) throw new AssertionError();
        System.out.println("test");
    }
    public static void main(String[] args){
        try {
            test();
        }catch (Exception ex){
            System.out.println("exception");
        }
        System.out.println("end");
    }
}
// Answer: A throwable is thrown by main