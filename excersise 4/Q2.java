import java.util.Scanner;

class Q2
{
String fname,lname;
int age;
Scanner s = new Scanner(System.in);

public static void main(String []aa)
{
student obj1 = new student();
employee obj2 = new employee();
obj1.accept();
obj2.accept();
}
}

class student extends Q2
{
String course,sid;
void accept()
{
System.out.println("Enter first name");
fname=s.next();
System.out.println("Enter last name");
lname=s.next();
System.out.println("Enter age");
age=s.nextInt();
System.out.println("Enter course enrolled");
course=s.nextLine();
System.out.println("Enter student id");
sid=s.nextLine();
}
}

class employee extends Q2
{
String eid,desig,dept;
float sal;

void accept()
{
System.out.println("Enter first name");
fname=s.next();
System.out.println("Enter last name");
lname=s.next();
System.out.println("Enter age");
age=s.nextInt();
System.out.println("Enter employee id");
eid=s.nextLine();
System.out.println("Enter designation");
desig=s.nextLine();
System.out.println("Enter department");
dept=s.nextLine();
}
}

