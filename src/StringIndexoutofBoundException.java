public class StringIndexoutofBoundException
{
    public static void main(String[] args) {
        try
        {
            String a="Rakesh Sanjay Musale";
            char b=a.charAt(25);
            System.out.println(b);
        }
        catch (StringIndexOutOfBoundsException n)
        {
            System.out.println("StringIndexOutOfBoundException..");
        }
    }
}
