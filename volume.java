import java.util.Scanner;
class volume
{
double r,h,vol;

void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius and height of the cylinder");
r=s.nextDouble();
h=s.nextDouble();
}

void volu()
{
vol=3.14*r*r*h;
System.out.println("The volume of the cylinder is " +vol);
}

public static void main(String []aa)
{
volume obj = new volume();
obj.accept();
obj.volu();
}
}