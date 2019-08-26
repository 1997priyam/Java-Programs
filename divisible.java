import java.util.Scanner;

class divisible
{
Scanner s = new Scanner(System.in);
float a,b;
 void accept()
{
System.out.println("Enter two numbers to be divided : ");
a=s.nextFloat();
b=s.nextFloat();

if(a%b==0)
System.out.println("DIVISIBLE");
else System.out.println("Not DIVISIBLE");
}

public static void main(String args[])
{
divisible obj = new divisible();
obj.accept();
}
}