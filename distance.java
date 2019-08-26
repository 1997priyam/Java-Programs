import java.util.Scanner;
class distance
{
float u,t,a,d;
void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the initial velocity, time taken and acceleration");
u=s.nextFloat();
t=s.nextFloat();
a=s.nextFloat();
}
void dist()
{
d=(u*t)+(a*t*t)/2;
System.out.println("The distance travelled is " +d);
}
public static void main(String []aa)
{
distance obj= new distance();
obj.accept();
obj.dist();
}
}