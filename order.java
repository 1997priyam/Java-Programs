import java.util.*;

class customer
{
String name,ph;
Scanner s = new Scanner(System.in);

void accept()
{
System.out.println("Enter the name : ");
name=s.nextLine();
System.out.println("Enter the phone number : ");
ph=s.next();
}
}

class order extends customer
{
Scanner sc = new Scanner(System.in);
String arr[] = new String[10];
ArrayList<String> al = new ArrayList<String>();

void accept_order()
{
System.out.println("Enter the order details : ");
for(int i=0; i<10; i++)
{
System.out.print((i+1)+". ");
arr[i]=sc.nextLine();
al.add(arr[i]);
}
}

void display()
{
int a=0;
System.out.println("Customer Name : "+name+"                Customer phone : "+ph);
System.out.println("Order details : ");
for(String x : al)
{
a++;
System.out.println(a+"."+" "+x);
}
}

public static void main(String args[])
{
order obj = new order();
obj.accept();
obj.accept_order();
obj.display();

}
}

