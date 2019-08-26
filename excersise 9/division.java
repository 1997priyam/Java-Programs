import java.util.Scanner;

class division
{
float a,b,res=0;
Scanner s = new Scanner(System.in);

void accept() 
{
System.out.println("Enter the two numbers to be divided (a/b)");
a=s.nextFloat();
b=s.nextFloat();
try
{
res=a/b;
}
catch(ArithmeticException e)
{
System.out.println("Cannot divide a number by zero"+e);
}
System.out.println("Result = "+res);
}

public static void main(String []aa)
{
division obj = new division();
obj.accept();
}
}