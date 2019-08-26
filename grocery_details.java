

class grocery_details
{
float wt,pr;
String name;

grocery_details()
{
wt=5;
pr=60;
name="Sugar";
}

void add()
{
wt+=5;
System.out.println("Weight after addition is "+wt);
}

void remove()
{
wt-=2;
System.out.println("Weight after subtracting is "+wt);
}

void display()
{
System.out.println("The current weight is "+wt + " price is "+pr +" Name of the produt is " +name);
}

public static void main(String []aa)
{
grocery_details obj = new grocery_details();
obj.add();
obj.remove();
obj.display();
}
}