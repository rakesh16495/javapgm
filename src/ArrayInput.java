import java.util.Scanner;

public class ArrayInput
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int num[]= new int[3];
        for(int i=0;i<3;i++)
        {
            num[i]= scanner.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("Number ["+i+"] is :"+num[i]);
        }
    }
}
