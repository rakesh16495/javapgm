package Thread;
public class Godown
{
    public static final int CAPACITY =10;
    int currentItemCount;
    public synchronized void pushItem()
    {
        try {
            if (CAPACITY >= currentItemCount) {
                if (currentItemCount == 0) {
                    notify();
                }
                currentItemCount++;
            } else {
                System.out.println("Producer is sleep...");
                wait();
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public synchronized void getItem() {
        try {
            if (currentItemCount == 0)
            {
                System.out.println("Consumer is sleep..");
                wait();
            } else if (currentItemCount == CAPACITY)
            {
                notify();
            }
            currentItemCount--;
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

