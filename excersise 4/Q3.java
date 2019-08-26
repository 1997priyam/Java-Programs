import java.util.Scanner;

class Q3
{
float l,b;
Scanner s = new Scanner(System.in);

void accept()
{
System.out.println("Enter the length and breadth of the rectangle");
l=s.nextFloat();
b=s.nextFloat();
}

public boolean equals(Q3 o)   //If i am taking Object class instead of Q3 here its not working 
{
return (this.l==o.l && this.b==o.b);
}

public static void main(String []aa)
{
boolean a;
Q3 obj1 = new Q3();
Q3 obj2 = new Q3();
obj1.accept();
obj2.accept();
a=obj1.equals(obj2);
System.out.println(a);
}
}