class prime20
{
int a,flag;
void check()
{
System.out.println("2");
for(int i=3; i<=20; i++)
{
for(int j=2; j<=(i/2+1); j++)
{
a=i%j;
if(a==0)
{
flag=0;
break;
}
else
flag++;
}
if(flag!=0)
System.out.println(i);
}
}

public static void main(String []aa)
{
prime20 obj = new prime20();
obj.check();
}
}