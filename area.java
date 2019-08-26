import java.util.Scanner;

class area
{
float num;
void get_data()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter any number: ");
num=s.nextFloat();
}
void areas()
{
System.out.println("Area of square is = "+num*num);
System.out.println("Area of circle is = "+3.14*num*num); 
}
public static void main(String []aa)
{
area obj = new area();
obj.get_data();
obj.areas();
}
}