package Thread;
public class ThreadDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            Thread t =Thread.currentThread();
            System.out.println("Thread"+t.getId()+"Running"+i);
            System.out.println("Priority Before= "+t.getPriority());
            t.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Set Priority= "+t.getPriority());
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            ThreadDemo o= new ThreadDemo();
            o.start();
        }
    }

}
