import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Add
{
    int addNumber(int num1, int num2)
    {
        return (num1+num2);
    }

    public static void main(String args[]) throws IOException {
        InputStreamReader inputStreamReader= new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int num1 = Integer.parseInt(bufferedReader.readLine());

        Add add =new Add();

        int result= add.addNumber(num1,8);
        System.out.println("\n Result is: "+result);
    }
}
