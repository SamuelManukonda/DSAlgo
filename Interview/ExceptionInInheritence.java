package Interview;

import java.io.IOException;
import java.net.ConnectException;
import java.util.concurrent.CompletionException;

public class ExceptionInInheritence {


    class A {
        void m1() throws RuntimeException {
            System.out.println("This is parent method");
        }
    }

    class B extends A{
        @Override
        void m1() throws ArithmeticException{
            super.m1();
        }
    }
}
