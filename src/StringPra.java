
public class StringPra
{
    public static void main(String[] args) {
        String name=" Rakesh Musale ";
        String rr="ovi";
         int countofIndex = 0;
       int c= name.lastIndexOf('h');
        name= name.replace("a","o");
        name= name.replaceAll("e","hhh");
        boolean res = name.endsWith("bb");
        boolean re= name.startsWith(" ");
        rr= rr.toUpperCase();
        System.out.println(c);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(res);
        System.out.println(re);
        System.out.println(rr);
    }
}
