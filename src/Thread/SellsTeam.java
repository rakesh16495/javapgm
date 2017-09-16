package Thread;

public class SellsTeam extends Thread
{
    Godown godown;
    SellsTeam(Godown g)
    {
        this.godown=g;
    }

    public void run()
    {
        for(int i=0;i<100;i++)
        {
            godown.getItem();
        }
    }
}