import java.util.Scanner;

class disco	
{
String name,no;
int age;
Scanner s = new Scanner(System.in);

void accept() throws Exception
{
System.out.println("Enter the details as follows :");
System.out.print("Enter the Name : ");
name=s.nextLine();
System.out.println("\nEnter the contact number : ");
no=s.next();
System.out.println("\nEnter the age : ");
age=s.nextInt();
if(age<18 || age>55)
throw new Exception("Age should be in between 18-55 years");
else
System.out.println("You can enter the DISCO !!");
}

public static void main(String []args) throws Exception
{
disco obj = new disco();
obj.accept();
}
}