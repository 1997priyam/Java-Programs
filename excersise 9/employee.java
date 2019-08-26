import java.util.Scanner;


class EmpIdException extends Exception
{
EmpIdException(String s)
{
super(s);
}
}

class employee 
{
String empid,empname,dept,desig,doj,dob,mast,con,fl;
String dom=("N/A");
int choice;
Scanner s = new Scanner(System.in);


void menu() throws Exception
{
do
{
System.out.println("-------------------MENU-------------------");
System.out.println("1. Enter Data");
System.out.println("2. Display Data");
System.out.println("3. Exit");
System.out.println("Choose an option : ");
choice=s.nextInt();
if(choice!=1 && choice!=2 && choice!=3)
throw new EmpIdException("Invalid Input enter only 1,2 and 3");
else
{
switch(choice)
{
case 1 : accept();
         break;
case 2 : display();
         break;
case 3 : System.exit(0);


}
}
}
while(con.equals("yes"));
}

void accept() throws Exception
{
System.out.println("Enter employee ID : ");
empid=s.next();
fl=empid.substring(0,1);

if(!(fl.equals("e")) && !(fl.equals("E")))
throw new Exception("Employee ID should start with e or E");


System.out.println("Enter employee name : ");
empname=s.next();
System.out.println("Enter the department : ");
dept=s.next();
System.out.println("Enter employee's designation : ");
desig=s.next();
System.out.println("Enter date of joining : ");
doj=s.next();
System.out.println("Enter DOB : ");
dob=s.next();
System.out.println("Enter maritial status (yes/no) : ");
mast=s.next();
if(mast.equals("yes"))
{
System.out.println("Enter the date of marriage : ");
dom=s.next();
}
contin();
}

void display()
{
System.out.println("Employee ID : "+empid);
System.out.println("Employee Name : "+empname);
System.out.println("Employee Department : "+dept);
System.out.println("Employee Designation : "+desig);
System.out.println("Employee's date of joining : "+doj);
System.out.println("Employee's DOB : "+dob);
System.out.println("Employee's Maritial Status : "+mast);
System.out.println("Employee's date of marriage : "+dom);
contin();
}

void contin()
{
System.out.println("Do you want to continue ? (yes/no)");
con=s.next();
}

public static void main(String []aa) throws Exception
{
Scanner sc = new Scanner(System.in);
String opt;
employee obj = new employee();
obj.menu();
System.out.println("Do you want to add more records ? (yes/no)");
opt=sc.next();
if(opt.equals("yes"))
obj.menu();
else
System.out.println("-------------------THANK YOU----------------");
}
}