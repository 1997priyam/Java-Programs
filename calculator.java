import java.util.Scanner;

class calculator
{
int num;
float a,b,result;
String ch;
Scanner s = new Scanner(System.in);
void show()
{
do
{
System.out.println("----------------CALCULATOR-------------------");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multipliaction");
System.out.println("4. Division");
System.out.println("Choose an option : ");
num=s.nextInt();
if(num==1 || num==2 || num==3 || num==4)
{
System.out.println("Enter two numbers");
a=s.nextFloat();
b=s.nextFloat();
}
else
{
System.out.println("Invalid number");
wish();
}
switch(num)
{
case 1 : add(a,b); break;
case 2 : sub(a,b); break;
case 3 : mul(a,b); break;
case 4 : div(a,b); break;
default : break;
}
}
while(ch.equals("yes"));
}

void add(float x, float y)
{
result=x+y;
display(result);
}

void sub(float x, float y)
{
result=x-y;
display(result);
}

void mul(float x, float y)
{
result=x*y;
display(result);
}

void div(float x, float y)
{
result=x/y;
display(result);
}

void display(float res)
{
System.out.println("Result = "+res);
wish();
}

void wish()
{
System.out.println("Do you wish to continue ? (yes/no)");
ch=s.next();
}
public static void main(String []aa)
{
calculator obj = new calculator();
obj.show();
System.out.println("---------------THANK YOU------------------");
}
}