package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolController
{
    public static void main(String[] args) {
        ExecutorService e= Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++)

        {
            ThreadPoolDemo tpd = new ThreadPoolDemo("I am" + i);

            e.execute(tpd);

        }

            e.shutdown();
    }
}
