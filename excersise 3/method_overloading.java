class method_overloading
{
int sum;
float sum1;
void add(int x, int y)
{
sum=x+y;
System.out.println("Sum of two integers is = "+sum);
}

void add(float x, float y)
{
sum1=x+y;
System.out.println("Sum of two decimal is = "+sum1);
}

void add(int x, int y, int z)
{
sum=x+y+z;
System.out.println("Sum of three integers is = "+sum);
}

public static void main(String []aa)
{
method_overloading obj = new method_overloading();
obj.add(2,3);
obj.add(2.3f,2.7f);
obj.add(2,3,4);
}
}