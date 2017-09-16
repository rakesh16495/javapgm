class Calculator
{
    int add(int num1 ,int num2)
    {
       return(num1+num2);
    }
    float sub(float num1,float num2)
    {
        return (num1-num2);
    }
    double multi(double num1,double num2)
    {
        return(num1*num2);

    }

    public static void main(String args[])
    {
        Calculator cal=new Calculator();

        int result1= cal.add(50,60);
        System.out.println("\n Addition of int : "+result1);

        float result2= cal.sub(5,6);
        System.out.println("\n Subtraction of float no.s"+result2);

        double result3= cal.multi(5,8);
        System.out.println("\n Multiplication of double no.s"+result3);

    }
}
