import java.util.Scanner;

class employee_det
{
Scanner s = new Scanner(System.in);
String arr[] = new String[7];

void accept()
{
System.out.println("Enter Employee id, name, department, designation, date of joining, date of birth and maritil status : ");
for(int i=0; i<7; i++)
{
arr[i]=s.nextLine();
}
}

void display()
{
System.out.println("Employee details is as follows : ");
for(int i=0; i<7; i++)
{
System.out.println(arr[i]);
}
}

public static void main(String []aa)
{
employee_det obj = new employee_det();
obj.accept();
obj.display();
}
}