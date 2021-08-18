package exceptionhandling;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            new ExceptionHandling4.B().process();
        }catch (IOException e){
            System.out.println("Exception");
        }

    }
}
