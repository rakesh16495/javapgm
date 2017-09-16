package Thread;
public class MultithreadingDemo implements Runnable
{
    public static void main(String[] args) {
        MultithreadingDemo md = new MultithreadingDemo();
        Thread t =new Thread(md);
      t.start();
    }
    public void run()
    {
        System.out.println("Thread Running");
    }
}
