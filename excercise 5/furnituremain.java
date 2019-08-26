import java.util.Scanner;

abstract class furniture
{
float price;
int width;
int height;
abstract void accept();
abstract void display();
}

class chair extends furniture
{
int nol;
void accept()
{
price=400;
width=36;
height=48;
nol=4;
}

void display()
{
System.out.println("Values for chair are : ");
System.out.println("Price = "+price);
System.out.println("Width = "+width);
System.out.println("Height = "+height);
System.out.println("Number of legs = "+nol);
}
}

class bookshelf extends furniture
{
int nos;
void accept()
{
price=800;
width=80;
height=50;
nos=10;
}

void display()
{
System.out.println("Values for bookshelves are : ");
System.out.println("Price = "+price);
System.out.println("Width = "+width);
System.out.println("Height = "+height);
System.out.println("Number of shelves = "+nos);
}
}

class furnituremain
{
public static void main(String []aa)
{
chair obj = new chair();
obj.accept();
obj.display();

bookshelf obj1 = new bookshelf();
obj1.accept();
obj1.display();
}
}