package exceptionhandling;

import java.io.IOException;

class ExceptionHandling4{
    public void process() throws IOException {
        System.out.println("A, ");
    }
    static class B extends ExceptionHandling4{
        public void process() throws IOException{
            super.process();
            System.out.println("B, ");
            throw new IOException();
        }
    }
}

    // Answer: Compilation fails because of an error in line 4
