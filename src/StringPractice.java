public class StringPractice
{
    public static void main(String[] args) {
        String name= "Mutex Infotech";
        int countofE=0;

        for(int i=0;i<name.length();i++)
        {
            char c=name.charAt(i);

            if(c=='e')
                countofE++;
        }
        System.out.println(countofE++);
    }
}
