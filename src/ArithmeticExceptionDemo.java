public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try{
            int a=5,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divided by Exception 0..");
        }
    }
}
