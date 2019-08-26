class table5
{
int mul=1;
void show()
{
for(int i=1; i<=10; i++)
{
mul=5*i;
System.out.println("5 * "+i +" = "+mul);
}
}

public static void main(String []aa)
{
table5 obj = new table5();
obj.show();
}
}