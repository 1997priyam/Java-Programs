import java.util.Scanner;

class simpleinterest
{
 float p,r,t,si;
 void get_data()
 {
  System.out.println("Enter the principle amount, rate of interest(per annum) and time(in years)");
  Scanner s= new Scanner(System.in);
  p=s.nextFloat();
  r=s.nextFloat();
  t=s.nextFloat();
 }
void simpleInterest()
{
si=(p*r*t)/100;
System.out.println("Simple interest is " +si);
}

public static void main(String []aa)
{
simpleinterest obj = new simpleinterest();
obj.get_data();
obj.simpleInterest();
}


}
