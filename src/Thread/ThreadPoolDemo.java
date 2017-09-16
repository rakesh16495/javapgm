package Thread;
public class ThreadPoolDemo implements Runnable
{
    String message="";
    ThreadPoolDemo(String msg)
    {
        this.message= msg;

    }
    public void run()
    {
        System.out.println("Thread="+Thread.currentThread().getName());
    }

}
