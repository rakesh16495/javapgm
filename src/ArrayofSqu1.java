import java.util.Scanner;

public class ArrayofSqu1
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int []num = new int[5];
        System.out.println("\n Enter the no: ");

        String square="";
        String cub="";

        for(int i=0;i<5;i++)
        {
            num[i]= scanner.nextInt();

            if(num[i]%2==1)
            {
                square = square+(num[i]*num[i]);
                System.out.println(square);
            }
            else
            {
                cub= cub+(num[i]*num[i]*num[i]);
                System.out.println(cub);
            }

        }
    }
}
