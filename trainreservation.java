import java.util.Scanner;
class trainreservation
{
String name,trainname,bstn,dstn,trainno,age;
void accept()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the name of the passenger : ");
name=s.nextLine();
System.out.println("Enter the age of passenger : ");
age=s.nextLine();
System.out.println("Enter the train name and number : ");
trainname=s.nextLine();
trainno=s.nextLine();
System.out.println("Enter the boarding and destination station name : ");
bstn=s.nextLine();
dstn=s.nextLine();
}

void display()
{
System.out.println("Name of the passesnger is "+name);
System.out.println("Age is "+age);
System.out.println("Train name = "+trainname);
System.out.println("Train no. = "+trainno);
System.out.println("Boarding station = "+bstn);
System.out.println("Destination station = "+dstn);
}
public static void main(String []aa)
{
trainreservation obj = new trainreservation();
obj.accept();
obj.display();
}
}