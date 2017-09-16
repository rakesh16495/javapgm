package StudentInfo;

import java.util.Scanner;

public class StudentData
{
    public static void main(String args[])
    {
        Student stud = new Student();
        Scanner scanner = new Scanner(System.in);

       int rollNum = Integer.parseInt(scanner.nextLine());
       float marks= Float.parseFloat(scanner.nextLine());
       String name= scanner.nextLine();

       stud.setRollNum(rollNum);
        stud.setMarks(marks);
        stud.setName(name);


       int num=stud.getRollNumber();
        marks = stud.getMarks(marks);
        name = stud.getName(name);

       System.out.println("\n RollNumber: "+num);
       System.out.println("\n Markes: "+marks);
        System.out.println("\n Name: "+name);

    }
}
