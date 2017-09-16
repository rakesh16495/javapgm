package StudentInfo;
public class Student
{
    private int rollNum;
    private String name;
    private float marks;

    public void setRollNum(int rollNum)
    {
        this.rollNum=rollNum;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setMarks(float marks)
    {
        this.marks= marks;
    }
    public int getRollNumber()
    {
        return this.rollNum;
    }
    public String getName(String name)
    {
        return this.name;

    }
    public float getMarks(float marks)
    {
        return this.marks;
    }
}
