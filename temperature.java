import java.util.Scanner;
class temperature
{
Double f,c;

void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the temperature in celsius");
c=s.nextDouble();
}

void temp()
{
f=c*(9/5)+32;
System.out.println("The temperature in farenheit is " +f);
}

public static void main(String []aa)
{
temperature obj = new temperature();
obj.accept();
obj.temp();
}
}