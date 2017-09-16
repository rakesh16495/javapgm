package Thread;

public class ProductApp
{
    public static void main(String args[])
    {
        Godown g1 =new Godown();
        System.out.println("..Godown object created..");
        Producer p1 =new Producer(g1);
        System.out.println("..Producer object created..");
        SellsTeam s1 =new SellsTeam(g1);
        System.out.println("..SellsTeam object created..");

        p1.start();
        s1.start();

    }
}

