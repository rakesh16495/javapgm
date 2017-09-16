package Thread;
public class JoinMain implements Runnable {
    public static void main(String[] args) {
        JoinMain m=new JoinMain();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t1.start();
        t2.start();
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread"+Thread.currentThread().getName()+"="+i);
        }
    }
}
