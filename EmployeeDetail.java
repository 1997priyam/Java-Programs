import java.util.Scanner;
class EmployeeDetail
{
int a;
void initialDisplay()
{
System.out.println("------------Menu------------");
System.out.println("1. Enter Data");
System.out.println("2. Display Data");
System.out.println("3. Exit");
System.out.println("Choose an option");
Scanner s = new Scanner(System.in);
a=s.nextInt();
switch(a)
{
case 1: enterdata();
        break;
case 2: displaydata();
        break;
case 3: 
        break;
default : System.out.println("Incorrect value entered");
}
}
void enterdata()
{
System.out.println("Enter data method is invoked");
}
void displaydata()
{
System.out.println("Display data method is invoked");
}

public static void main(String []aa)
{
EmployeeDetail obj = new EmployeeDetail();
obj.initialDisplay();

}
}