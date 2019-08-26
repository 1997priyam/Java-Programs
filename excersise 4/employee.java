import java.util.Scanner;

class employee
{
String id,name,desig,dept;
Scanner s = new Scanner(System.in);
void accept()
{
System.out.println("Enter the employee ID");
id=s.nextLine();
System.out.println("Enter the employee name");
name=s.nextLine();
System.out.println("Enter the designation");
desig=s.nextLine();
System.out.println("Enter the department");
dept=s.nextLine();
}

public String toString()
{
return "Employee ID = "+id+"\n Employee Name : "+name+"\n Employee designation : "+desig+"\n Employee department : "+dept;
}

public static void main(String []aa)
{
employee obj = new employee();
obj.accept();
System.out.println(obj);
}
}