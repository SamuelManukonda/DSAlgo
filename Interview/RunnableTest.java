package Interview;

import java.util.HashSet;

public class RunnableTest {



    public static void main(String[] args) {
        int i=1;
        Runnable runnable=()->{
            System.out.println(i);
        };
        Thread thread=new Thread(runnable);
        thread.start();

    }
}
